package Seminars.Sem004.task003;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    /**
     * @apiNote Написать класс калькулятор, принимающий лист челочисленных значений,
     *          возвращающий сумму элементов коллекции (метод sum)
     * @param numbers массив чисел
     * @return Сумма всех элементов массива
     */

    public List<Double> binaryString(List<String> numbers) {
        List<Double> res = new ArrayList<>();
        for (String number : numbers) {
            res.add(Double.parseDouble(number));
        }
        return res;
    }

    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double subtr(List<? extends Number> numbers) {
        Double res = 0.0;
        int count = 0;
        Double res2 = 0.0;
        for (Number number : numbers) {
            if (count == 0) {
                res = number.doubleValue() - res2;
            } else {
                res -= number.doubleValue();
            }
            count++;
            // System.out.println(res);
        }
        return res;
    }

    public Double mult(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double div(List<? extends Number> numbers) {
        Double res3 = 1.0;
        int count = 0;
        Double res4 = 1.0;
        for (Number number : numbers) {
            if (count == 0) {
                res4 = number.doubleValue() / res3;
            } else {
                res4 /= number.doubleValue();
            }
            count++;
            // System.out.println(res4);
        }
        return res4;
    }

    public void test(Object value) {

        if (value instanceof Integer) {
            System.out.println("Это Integer");
        } else if (value instanceof String) {
            System.out.println("Это String");
        } else if (value instanceof Float) {
            System.out.println("Это Float");
        } else if (value instanceof Double) {
            System.out.println("Это Double");
        }
    }
}
