package Seminars.Sem004.task002;

public class Main {
    public static void main(String[] args) {

        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber(1, 5, 3, 4);
        System.out.println("Среднее значение = " + boxWithNumber.average());

        BoxWithNumber<Double> boxWithNumber2 = new BoxWithNumber(3, 8, 0, 4);
        System.out.println("Среднее значение = " + boxWithNumber2.average());

        System.out.println("Равны ли средние значения? " + boxWithNumber.compareAvarage(boxWithNumber2));

    }
}
