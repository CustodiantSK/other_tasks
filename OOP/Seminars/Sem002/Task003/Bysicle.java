package Seminars.Sem002.Task003;

public class Bysicle implements Transport {

    @Override
    public void start() {
        System.out.println("Велосипед едет --***");
    }

    public void stop() {
        System.out.println("Велосипед остановился!!! ");
    }
}
