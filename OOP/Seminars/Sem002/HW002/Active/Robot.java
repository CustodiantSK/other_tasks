package Seminars.Sem002.HW002.Active;

import Seminars.Sem002.HW002.Actions;

public class Robot implements Actions {

    @Override
    public void start() {
        System.out.println("Робот начал испытание!");
    }

    public void stop() {
        System.out.println("Робот остановлен.");
    }

    public void runing() {
        System.out.print("Робот бежит...");
    }

    public void jump() {
        System.out.print("Робот прыгает...");
    }
}
