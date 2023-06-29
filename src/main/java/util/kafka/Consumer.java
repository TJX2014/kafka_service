package util.kafka;

import kafka.tools.ConsoleConsumer;

public class Consumer {

    public static void main(String[] args) {
        String[] args1 = new String[]{"--bootstrap-server", "localhost:9092", "--topic", "test1"};

        ConsoleConsumer.main(args1);
    }
}
