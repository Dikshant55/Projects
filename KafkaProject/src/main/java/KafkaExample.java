import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class KafkaExample {

    private static final String TOPIC_NAME = "test-topic";
    private static final String BOOTSTRAP_SERVERS = "localhost:9092";
    private static final String GROUP_ID = "test-group";

    public static void main(String[] args) {

        // Set producer properties
        Properties producerProps = new Properties();
        producerProps.put("bootstrap.servers", BOOTSTRAP_SERVERS);
        producerProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producerProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // Create Kafka producer instance
        KafkaProducer<String, String> producer = new KafkaProducer<>(producerProps);

        // Produce messages
        for (int i = 0; i < 10; i++) {
            String message = "Message " + i;
            ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, message);
            producer.send(record);
        }

        // Flush and close producer
        producer.flush();
        producer.close();

        // Set consumer properties
        Properties consumerProps = new Properties();
        consumerProps.put("bootstrap.servers", BOOTSTRAP_SERVERS);
        consumerProps.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        consumerProps.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        consumerProps.put("group.id", GROUP_ID);

        // Create Kafka consumer instance
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(consumerProps);

        // Subscribe to the topic
        consumer.subscribe(Collections.singletonList(TOPIC_NAME));

        // Consume messages
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("Received message: %s\n", record.value());
            }
        }
    }
}
