package Seminars.Sem004.task003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 10; i > 0; i -= 2) {
            doubleList.add((double) i);
            integerList.add(i);
            String str = String.valueOf(i);
            stringList.add(str);
        }

        System.out.println("Проверим значения в листе doubleList " + doubleList);
        for (int index = 0; index < doubleList.size(); index++) {
            calc.test(doubleList.get(index));
        }

        System.out.println("Проверим значения в листе  integerList " + integerList);
        for (int index = 0; index < integerList.size(); index++) {
            calc.test(integerList.get(index));
        }

        System.out.println("Проверим значения в листе stringList " + stringList);
        for (int index = 0; index < stringList.size(); index++) {
            calc.test(stringList.get(index));
        }

        /**
         * конвертация строк в формат дабл
         */
        List<Double> convertStringList = calc.binaryString(stringList);
        System.out.println("Проверим значения в листе stringList" + convertStringList + " после конвертации");
        for (int index = 0; index < convertStringList.size(); index++) {
            calc.test(convertStringList.get(index));
        }

        /**
         * сложение
         */
        System.out.println("Сложение");
        System.out.println("Sum Double = " + calc.sum(doubleList));
        System.out.println("Sum Integer = " + calc.sum(integerList));
        System.out.println("Sum String = " + calc.sum(convertStringList));
        /**
         * Вычитание
         */
        System.out.println("Вычитание");
        System.out.println("Subtr Double = " + calc.subtr(doubleList));
        System.out.println("Subtr Integer = " + calc.subtr(integerList));
        System.out.println("Subtr String = " + calc.subtr(convertStringList));
        /**
         * Умножение
         */
        System.out.println("Умножение");
        System.out.println("Multiplikation double = " + calc.mult(doubleList));
        System.out.println("Multiplikation Integer = " + calc.mult(integerList));
        System.out.println("Multiplikation String = " + calc.mult(convertStringList));
        /**
         * деление
         */
        System.out.println("Деление");
        System.out.println("Division double = " + calc.div(doubleList));
        System.out.println("Division Integer = " + calc.div(integerList));
        System.out.println("Division String = " + calc.div(convertStringList));
    }
}
