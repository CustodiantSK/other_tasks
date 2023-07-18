package org.example.z1;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
//        cat.setName("Тиша");
//        cat.setColor("Black");
//        cat.setAge(31);
//        System.out.println("cat = " + cat);
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
        Animal[] catAndDogs = {
                new Cat("qwe", "asd", 21),
                new Dog("bobik", "black", 31)
        };
//        for (Animal o : catAndDogs) {
//            if (o instanceof Cat) {
//                o=null;
//                ((Cat) o).klubok();
//            } else {
//                System.out.println("не кот!");
//            }
//        }

    }

}