package com.utility.messagebus;

import com.analyzer.subscriber.Subscriber;
import com.utility.exceptions.PublishException;

public interface ConsumerClient {
	public void createConnection(String topic);
	public void startStreaming(Subscriber subscriber) throws PublishException;
}
