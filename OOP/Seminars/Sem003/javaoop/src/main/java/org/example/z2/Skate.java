package org.example.z2;

public class Skate implements Transport{
    @Override
    public void start() {
        System.out.println(" скейт поехала!");
    }

    @Override
    public void stop() {
        System.out.println(" скетй остановился!");
    }
}
