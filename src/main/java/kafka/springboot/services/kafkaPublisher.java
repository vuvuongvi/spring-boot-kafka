package kafka.springboot.services;

public interface kafkaPublisher {
	public abstract void publishTopic(String msg);
}
