package util.kafka.kerberos;

import kafka.tools.ConsoleConsumer;

public class Consumer {

    public static void main(String[] args) {
        System.setProperty("java.security.krb5.conf", "src/main/resources/krb5.conf");
        System.setProperty("java.security.auth.login.config", "src/main/resources/kafka-client-jaas.conf");

        String[] args1 = new String[]{"--bootstrap-server", "localhost:9092",
                "--topic", "test2", "--consumer.config", "src/main/resources/client-sasl.properties"};
        ConsoleConsumer.main(args1);
    }
}
