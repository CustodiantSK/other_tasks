package Seminars.Sem003.javaoopFinal.src.main.java.org.example.z3.q2;

public interface Game {
    void start(/* Integer sizeWord, */ Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
