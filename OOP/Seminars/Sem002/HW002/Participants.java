package Seminars.Sem002.HW002;

public class Participants {

    private Actions currentActions;
    protected static int count;
    protected String name;
    protected String type;
    protected int maxDistance;
    protected Double maxHeight;
    public Object run;

    public void start(Actions Actions) {

        currentActions = Actions;
        System.out.println(name + " готовится к старту");
        Actions.start();
    }

    public void stop(Actions Actions) {
        if (currentActions != null) {
            currentActions.stop();
            currentActions = null;
        } else {
            System.out.println(type + " - " + name + " ожидает.");
        }
    }

    public void stop() {
        if (currentActions != null) {
            currentActions.stop();
            currentActions = null;
        } else {
            System.out.println(type + " - " + name + " ожидает.");
        }
    }

    public void runing(Actions Actions) {
        currentActions = Actions;
        Actions.runing();
    }

    public void jump(Actions Actions) {
        currentActions = Actions;
        Actions.jump();
    }

    public Participants(String name, String type, int maxDistance, Double maxHeight) {
        count++;
        this.name = name;
        this.type = type;
        if (type.equals("Робот")) {
            if (maxDistance > 20000) {
                this.maxDistance = 20000;
            }
            if (maxHeight > 5) {
                this.maxHeight = 5.0;
            }
        }
        if (type.equals("Cat")) {
            if (maxDistance > 5000) {
                this.maxDistance = 5000;
            }
            if (maxHeight > 4) {
                this.maxHeight = 4.5;
            }
        }
        if (type.equals("Human")) {
            if (maxDistance > 40000) {
                this.maxDistance = 40000;
            }
            if (maxHeight > 2) {
                this.maxHeight = 2.0;
            }
        } else {
            this.maxDistance = maxDistance;
            this.maxHeight = maxHeight;
        }
    }

    public Participants() {
    }

    protected boolean Flag = true;

    protected void run(int distant) {

        if (distant <= maxDistance) {
            System.out.println(type + " - " + name + " пробежал дистанцию: " + distant +
                    " км.");

        } else {
            System.out.println(type + " - " + name + " не смог преодолеть дистанцию: " +
                    distant + " км.");
            stop();
            System.out.println("Проиграл.");

            System.out.println();
            Flag = false;
        }

    }

    protected void barier(Double height) {
        if (height <= maxHeight) {
            System.out.println(type + " - " + name + " преодолел препядствие: " + height
                    + " метров");
            System.out.println("Испытание пройдено!");

        } else {
            System.out.println(type + " - " + name + " не смог преодолеть препядствие: "
                    + height + " метров");
            stop();
            System.out.println("Проиграл.");

            System.out.println();
            Flag = false;
        }
    }

}
