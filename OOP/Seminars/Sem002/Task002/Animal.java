package Seminars.Sem002.Task002;

public class Animal {
    protected String name;
    protected static int count;

    protected String type;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.type = type;
        if (type.equals("Кот")) {
            if (maxRunDistance > 200)
                this.maxRunDistance = 200;
            this.maxSwimDistance = maxSwimDistance;
        } else {
            if (maxRunDistance > 500)
                this.maxRunDistance = 500;
            if (maxSwimDistance > 10)
                this.maxSwimDistance = 10;
        }

    }

    public Animal() {
    }

    protected void run(int distant) {
        if (distant <= maxRunDistance) {
            System.out.println(type + " - " + name + " пробежало дистанцию: " + distant + " км.");
        } else {
            System.out.println(type + " - " + name + " не завершил дистанцию: " + distant + " км.");
        }

    }

    protected void swim(int distant) {
        if (distant <= maxSwimDistance) {
            System.out.println(type + " - " + name + " смогло проплыть дистанцию: " + distant + " км.");
        } else {
            System.out.println(type + " - " + name + " не проплыл дистанцию: " + distant + " км.");
        }

    }
}
