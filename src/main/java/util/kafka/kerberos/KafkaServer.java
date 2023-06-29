package util.kafka.kerberos;

public class KafkaServer {

    public static void main(String[] args) {
//        -Dzookeeper.sasl.client=false -Dzookeeper.sasl.client.username=zk-server -Djava.security.krb5.conf=/data/kafka_2.12-2.6.0/config/kerberos/krb5.conf -Djava.security.auth.login.config=/data/kafka_2.12-2.6.0/config/kerberos/kafka-server-jaas.conf
        System.setProperty("zookeeper.sasl.client", "false");
        System.setProperty("zookeeper.sasl.client.username", "zk-server");
        System.setProperty("java.security.krb5.conf", "src/main/resources/krb5.conf");
        System.setProperty("java.security.auth.login.config", "src/main/resources/kafka-server-jaas.conf");
        String[] args1 = new String[]{"src/main/resources/server-sasl.properties"};
        kafka.Kafka.main(args1);
    }
}
