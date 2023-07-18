package Seminars.Sem003.javaoopFinal.src.main.java.org.example.z3.q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File myFile = new File("OOP/Seminars/Sem003/javaoopFinal/src/main/java/org/example/z3/q2/logfile.txt");
        myFile.createNewFile();

        FileInputStream inputStream = new FileInputStream(myFile);
        byte[] buffer = new byte[1024];
        int bytesRead;

        FileOutputStream outputStream = new FileOutputStream(myFile);

        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***\n Давайте начнем игру 'Быки - коровы'." + "\n");
        for (int numberCountGames = 1; numberCountGames < 9999; numberCountGames++) {
            System.out.println(
                    "Выберите игровой режим, для этого нажмите необходимую цифру:" + "\n" +
                            "1 -> Начнем новую игру" + "\n" +
                            "2 -> Посмотреть результаты (за эту сессию)" + "\n" +
                            "0 -> Закончить и выйти из этой сессии");
            System.out.print("Ваш выбор: ");
            int i = scanner.nextInt();
            if (i == 1) {
                Date startData = new Date(System.currentTimeMillis());
                System.out.print(
                        "\n" +
                                "Игра началась! \n"/*
                                                    * +
                                                    * "Введите количество символов: "
                                                    */);
                // int length = scanner.nextInt();
                // /**
                // * Проверка на ввод неотрицательных значений количества символов
                // */
                // while (length <= 0) {
                // System.out.print("---> Количество символов не может быть меньше 1!\n" +
                // "Введите количество символов: ");
                // length = scanner.nextInt();
                // }

                System.out.print("***\nВведите максимальное количество попыток: ");
                Integer count = scanner.nextInt();
                /**
                 * Проверка на ввод неотрицательных значений количества попыток
                 */
                while (count <= 0) {
                    System.out.print("---> Количество попыток не может быть меньше 1!\n" +
                            "Введите максимальное количество попыток: ");
                    count = scanner.nextInt();
                }

                /**
                 * Старт игры
                 */
                numberGame.start(/* length, */ count);

                scanner.nextLine();
                while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                    System.out.println("------ \n Введите ваш ответ: ");
                    String value = scanner.nextLine();
                    Answer answer = numberGame.inputValue(value);
                    if (answer != null) {
                        System.out.println(answer);
                    }
                }

                Date endData = new Date(System.currentTimeMillis());
                Long finalTimeData = endData.getTime() - startData.getTime();

                if (numberGame.currentTry < count) {
                    byte[] buffer2 = (numberCountGames + " игра пройдена Успешно за: " +
                            finalTimeData + "мс. и за "
                            + numberGame.currentTry
                            + " попыток, из " +
                            count + " возможных \n").getBytes();
                    outputStream.write(buffer2);
                } else {
                    byte[] buffer2 = (numberCountGames + " игра пройдена за: " + finalTimeData + "мс. и за "
                            + numberGame.currentTry
                            + " попыток, из " +
                            count + " возможных \n").getBytes();
                    outputStream.write(buffer2);
                }
            } else if (i == 2) {
                System.out.println();
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, bytesRead));
                }

                System.out.println("\n" +
                        "1 - > Вернуться в главное меню." + "\n" +
                        "0 - > Закончить и выйти из игры.");
                int j = scanner.nextInt();
                while (j != 0 && j != 1) {
                    System.out.println("Введите 0 или 1 ");
                }
                if (j == 0) {
                    System.out.println("\n ---> Конец игры \n");
                    break;
                } else if (j == 1) {
                    System.out.println("Возврат в главное меню --->\n");
                }
            } else if (i == 0) {
                System.out.println("\n ---> Конец игры \n");
                break;
            } else {
                System.out.println("выбрать можно либо 1, либо 2, либо 0");
            }

        }

        scanner.close();
        inputStream.close();
        outputStream.close();
    }
}
