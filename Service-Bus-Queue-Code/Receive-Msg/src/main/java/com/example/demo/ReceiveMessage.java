package com.example.demo;

import com.microsoft.azure.servicebus.ExceptionPhase;
import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.IMessageHandler;
import com.microsoft.azure.servicebus.IQueueClient;
import static java.nio.charset.StandardCharsets.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Component
class ReceiveMessage {

	static final Gson GSON = new Gson();

	private final IQueueClient iQueueClient;

	ReceiveMessage(IQueueClient isc) {
		this.iQueueClient = isc;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void consume() throws Exception {

		this.iQueueClient.registerMessageHandler(new IMessageHandler() {

			@Override
			public CompletableFuture<Void> onMessageAsync(IMessage message) {
				System.out.println("Message Receiver");
				{
					if (message != null && message.getContentType().contentEquals("application/json")) {

						byte[] body = message.getBody();
						Map msg = GSON.fromJson(new String(body, UTF_8), Map.class);

						System.out.printf(
								"\n\t\t\t\tMessage received: \n\t\t\t\t\t\tMessageId = %s, \n\t\t\t\t\t\tSequenceNumber = %s, \n\t\t\t\t\t\tEnqueuedTimeUtc = %s,"
										+ "\n\t\t\t\t\t\tExpiresAtUtc = %s,\n\t\t\t\t\t\tLabel = %s, \n\t\t\t\t\t\tContentType = \"%s\",  \n\t\t\t\t\t\tContent: [ Product ID = %s, Name = %s ]\n",
								message.getMessageId(), message.getSequenceNumber(), message.getEnqueuedTimeUtc(),
								message.getExpiresAtUtc(), message.getLabel(), message.getContentType(),
								msg != null ? msg.get("ProductId") : "",
								msg != null ? msg.get("Name") : "");
					}
					else if(message != null && message.getContentType().contentEquals("text/plain"))
					{
						System.out.printf(
		        				"\n\t\t\t\tMessage received: \n\t\t\t\t\t\tMessageId = %s, \n\t\t\t\t\t\tSequenceNumber = %s, \n\t\t\t\t\t\tEnqueuedTimeUtc = %s,"
		        						+ "\n\t\t\t\t\t\tExpiresAtUtc = %s,\n\t\t\t\t\t\tLabel = %s, \n\t\t\t\t\t\tContentType = \"%s\",  \n\t\t\t\t\t\tContent: "
		        						+ new String(message.getBody()) + " ",
		        						message.getMessageId(), message.getSequenceNumber(), message.getEnqueuedTimeUtc(),
		        						message.getExpiresAtUtc(), message.getLabel(), message.getContentType());
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