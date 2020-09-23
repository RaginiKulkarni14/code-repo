1) run the script attached and update connection-string and queue-name in the application.proprties file

azure.servicebus.connection-string=Endpoint=sb://servicebus-queue-ns.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=58yfg67f7g77=
azure.servicebus.queue-name=queue

***for deadletterqueue the path will be as below**
//azure.servicebus.queue-name=queue/$deadletterqueue

Note : only one queue name will be provided you cannot give both normal queue and deadletterqueue at the same time.

2) You can also create a queue from the portal manualy

3)to enable dupliate detection on queue, you will have to select 'Enable-Duplicate-Detection' while creating queue(Supported in Standerd/Premium tier only)

######Sending and Receiveing Messages#########

***Sending Message****

1) do a mvn build and run 'Send-from-Web' as a Springboot Application. Hit the /home and send messages from Web Application.

2) After sending the Message verify the same in the portal against Queue created

***Receiveing Message****

3) run 'Receive-Msg' as a Springboot Application and receive the messages sent earlier.

######Sending and Receiveing Messages From Deadletterd Queue#########

***Sending Message****

1) do a mvn build and run 'Send-from-Web' as a Springboot Application. Hit the /home and send messages from Web Application.

2) After sending the Message verify the same in the portal against Queue created

***Unable to Receive Message****

3) run 'Receive-Error' as a Springboot Application and messages will be moved to deadlettered queue sent earlier because of the issue from receiver's end(iQueueClient.abandon(message.getLockToken());).
	You can notice in the receiver console the delivery count, once it has exceeded the max delivery count, messages will be moved to deadlettered queue.

***Receiveing deadlettered Message****

4) run 'Receive-DeadLettered' as a Springboot Application and receive the messages from deadletterqueue.

######Duplicate Detection on Queue#########

1)***Sending Message****

1) do a mvn build and run 'Send-from-Web' as a Springboot Application. Hit the /home and send messages from Web Application.

2) After sending the Message verify the same in the portal against Queue created

3) String messageId = UUID.randomUUID().toString(); // unique messageId
	final String messageId = Integer.toString(10); //duplicate messageId (cannot send again once send, as it will be duplicate)

***Receiveing Message****

3) run 'Receive-Msg' as a Springboot Application and receive the messages sent earlier.

	String messageId = UUID.randomUUID().toString(); // unique messageId (can b received again)
	final String messageId = Integer.toString(10); //duplicate messageId (cannot receive again once received, as it will be duplicate)