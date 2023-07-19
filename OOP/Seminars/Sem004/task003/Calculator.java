package Seminars.Sem004.task003;

import java.util.List;

public class Calculator {

    /**
     * @apiNote Написать класс калькулятор, принимающий лист челочисленных значений,
     *          возвращающий сумму элементов коллекции (метод sum)
     * @param numbers массив чисел
     * @return Сумма всех элементов массива
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }
}
