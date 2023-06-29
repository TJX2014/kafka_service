package util.kafka;

import org.apache.zookeeper.server.quorum.QuorumPeerMain;

public class ZkServer {

    public static void main(String[] args) {
        String[] args1 = new String[]{"src/main/resources/zookeeper.properties"};
        QuorumPeerMain.main(args1);
    }
}
