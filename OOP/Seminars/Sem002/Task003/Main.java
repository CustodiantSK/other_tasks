package Seminars.Sem002.Task003;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bysicle bysicle = new Bysicle();
        human.stop();
        human.drive(bysicle);
        human.stop();
        Motorcycle moto = new Motorcycle();
        human.stop();
        human.drive(moto);
        human.stop();
    }
}
