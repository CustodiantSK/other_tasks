package Seminars.Sem002.Task003;

public class Car implements Transport {

    @Override
    public void start() {
        System.out.println("Машина едет --***");
    }

    public void stop() {
        System.out.println("Машина остановилась!!! ");
    }
}
