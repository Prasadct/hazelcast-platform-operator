package org.example;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        ClientConfig config = new ClientConfig();
        config.getNetworkConfig().addAddress("hazelcast-sample");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(config);

        IMap<String, String> test = client.getMap("imap-sample");
        for (int i = 0; i < 100; i++) {
            test.put("key"+i, "Value"+i);
            System.out.println(test.get("key"+(i-1)));
            Thread.sleep(1000);
        }

        client.shutdown();
    }
}
