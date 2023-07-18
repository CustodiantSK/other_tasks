package org.example.z2;

public class Kater implements Transport {
    @Override
    public void start() {
        System.out.println(" катер поплыл");
    }

    @Override
    public void stop() {
        System.out.println(" катер остановился");

    }
}
