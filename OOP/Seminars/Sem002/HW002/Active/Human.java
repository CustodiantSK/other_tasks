package Seminars.Sem002.HW002.Active;

import Seminars.Sem002.HW002.Actions;

public class Human implements Actions {

    @Override
    public void start() {
        System.out.println("Человек начал испытание!");
    }

    public void stop() {
        System.out.println("Человек остановился.");
    }

    public void runing() {
        System.out.print("Человек бежит...");
    }

    public void jump() {
        System.out.println("Человек прыгает...");
    }
}
