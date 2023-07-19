package Seminars.Sem004.task003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 100; i += 50) {
            doubleList.add((double) i);
            integerList.add(i);
        }
        System.out.println("Sum double = " + calc.sum(doubleList));
        System.out.println("Sum integer = " + calc.sum(integerList));
    }
}
