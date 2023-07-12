package Seminars.Sem002.javaoop.src.main.java.org.example;

public class Dog extends Animal {

    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void klubok() {
        System.out.println("Это собака с именем " + name
                + ", с возрастом-" + age + " , c цветом шерсти: " + color + " -- свернулась в клубок");
    }

    @Override
    public void animalInfo() {
        System.out.println("собака ");
    }

    @Override
    public void voice() {
        System.out.println(" gav - gav ");
    }
}
