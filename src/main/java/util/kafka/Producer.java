package util.kafka;

import kafka.tools.ConsoleProducer;

public class Producer {
    public static void main(String[] args) {

        String[] args1 = new String[]{"--bootstrap-server", "localhost:9092", "--topic", "test2"};
        ConsoleProducer.main(args1);
    }
}
