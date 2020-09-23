package com.example.demo;

import com.microsoft.azure.servicebus.ExceptionPhase;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.IMessageHandler;
import com.microsoft.azure.servicebus.IQueueClient;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;

import static java.nio.charset.StandardCharsets.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Component
class ReceiveError {

	static final Gson GSON = new Gson();

	private final IQueueClient iQueueClient;

	ReceiveError(IQueueClient isc) {
		this.iQueueClient = isc;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void consume() throws Exception {

		this.iQueueClient.registerMessageHandler(new IMessageHandler() {

			@Override
			public CompletableFuture<Void> onMessageAsync(IMessage message) {
				System.out.println("DeadLettered Message Receiver");
				{
					if (message != null && message.getContentType().contentEquals("application/json")) {

						System.out.printf("Picked up message; DeliveryCount %d\n", message.getDeliveryCount());
						try {
							iQueueClient.abandon(message.getLockToken());
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ServiceBusException e) {
							e.printStackTrace();
						}
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else if(message != null && message.getContentType().contentEquals("text/plain"))
					{
						System.out.printf("Picked up message; DeliveryCount %d\n", message.getDeliveryCount());
						try {
							iQueueClient.abandon(message.getLockToken());
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ServiceBusException e) {
							e.printStackTrace();
						}
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
				return CompletableFuture.completedFuture(null);
			}

			@Override
			public void notifyException(Throwable exception, ExceptionPhase phase) {
				System.out.println("Exception Occured" + exception);
			}
		});
	}
}