package Seminars.Sem002.HW002.Active;

import Seminars.Sem002.HW002.Actions;

public class Cat implements Actions {

    @Override
    public void start() {
        System.out.println("Кот начал испытание!");
    }

    public void stop() {
        System.out.println("Кот остановился.");
    }

    public void runing() {
        System.out.print("Кот бежит...");
    }

    public void jump() {
        System.out.print("Кот прыгает...");
    }
}
