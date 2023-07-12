package Seminars.Sem002.javaoop.src.main.java.org.example;

public class Main {
    public static void main(String[] args) {
        // Cat cat = new Cat("qwe", "asd", 21);
        // па полям
        // cat.name = "Тиша";
        // cat.color = "Black";
        // cat.age = 21;
        // инкапсулировали
        // cat.setName("Тиша");
        // cat.setColor("Black");
        // cat.setAge(31);
        // System.out.println("cat = " + cat);
        // cat.jump();
        // cat.voice();
        // cat.animalInfo();

        Animal[] catAndDog = {
                new Cat("Gav", "Blue", 22),
                new Dog("Barsik", "Green", 15)
        };
        for (Animal o : catAndDog) {
            if (o instanceof Cat) {
                ((Cat) o).klubok();
            } else {
                System.out.println("No Cat");
            }
            o.voice();
        }
        // Animal cat2 = new Cat();
        // ((Cat) cat2).klubok();
    }

}