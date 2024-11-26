The transport consists of two parts: Transport Core and Connector.
The Transport Core is responsible for processing, serializing messages, and managing the application's lifecycle.
The Connector's task is solely to transmit messages from a publisher to a subscriber, and it must not modify the message structure.
A message sent via the Kafka Connector can be forwarded to the Aeron Connector without any changes.
