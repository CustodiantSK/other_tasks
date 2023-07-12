package Seminars.Sem002.Task003;

public class Motorcycle implements Transport {
    @Override
    public void start() {
        System.out.println("Мотоцикл едет --*** ");
    }

    public void stop() {
        System.out.println("Мотоцикл остановился!!! ");
    }
}
