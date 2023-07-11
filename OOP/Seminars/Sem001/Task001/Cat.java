package Seminars.Sem001.Task001;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        // this.age = age;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Значение возраста некорректно!");
        }
    }

    public Cat() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [color=" + color + ", age=" + age + "]";
    }

    @Override
    public void animalInfo() {
        // TODO Auto-generated method stub
        System.out.println("Кот: " + super.getName() +
                " с цветом шерсти: " + getColor() +
                " и возрастом: " + getAge() + " лет.");
    }

}
