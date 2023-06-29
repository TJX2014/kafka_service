package util.kafka;

public class KafkaServer {

    public static void main(String[] args) {
        String[] args1 = new String[]{"src/main/resources/server.properties"};
        kafka.Kafka.main(args1);
    }
}
