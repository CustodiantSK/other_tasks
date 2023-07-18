
package Seminars.Sem003.javaoopFinal.src.main.java.org.example.z3.q2;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("------ \n Компьютер загадал:  " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        if (value.length() == 0) {
            return null;
        }
        if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы проиграли по количеству попыток");

            return null;
        }
        int bull = 0;
        int cow = 0;
        if (value.length() == computerWord.length()) {
            for (int i = 0; i < value.length(); i++) {

                if (value.charAt(i) == computerWord.charAt(i)) {
                    bull++;
                    cow++;
                } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                    cow++;
                }
            }
            currentTry++;

        } else if (value.length() < computerWord.length()) {
            System.out.println("-->> Длина вашего слова меньше загаданого \n ---");
        } else if (value.length() > computerWord.length()) {
            System.out.println("-->> Длина вашего слова длиннее загаданого \n ---");
        }

        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;

            System.out.println(new Answer(bull, cow, currentTry));
            System.out.println(" -- >>> ВЫ Победили!!! \n");
            return null;
        }
        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }
}
