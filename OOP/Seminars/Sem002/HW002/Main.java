package Seminars.Sem002.HW002;

import Seminars.Sem002.HW002.Active.Cat;
import Seminars.Sem002.HW002.Active.Human;
import Seminars.Sem002.HW002.Active.Robot;
import Seminars.Sem002.HW002.Mount.CatUse;
import Seminars.Sem002.HW002.Mount.HumanUse;
import Seminars.Sem002.HW002.Mount.RobotUse;

/**
 * 1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного
 * класса. Эти классы должны уметь бегать и прыгать, все также с выводом
 * информации о действии в консоль.
 * 
 * 2) Создайте два класса: беговая дорожка и стена, при прохождении через
 * которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат
 * выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У
 * препятствий есть длина
 * (для дорожки) или высота (для стены), а участников ограничения на бег и
 * прыжки.
 * 
 * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех
 * участников пройти
 * этот набор препятствий. Если участник не смог пройти одно из препятствий, то
 * дальше по
 * списку он препятствий не идет.
 */

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        Participants[] participants = {
                new HumanUse("Павел", "Прыгун", 30000, 1.8),
                new HumanUse("Игорь", "Легкоатлет", 36000, 1.0),

                new RobotUse("R2d2", "Speedster", 18900, 3.0),
                new RobotUse("C3pO", "Jumper", 16000, 4.9),

                new CatUse("Barsik", "Бродячий кот", 5000, 4.5),
                new CatUse("Kote", "Титулованый", 3000, 5.0)
        };

        Landscape[] landscapes = {
                new Landscape(1500, 1.0),
                new Landscape(30000, 5.0),
                new Landscape(1000, 3.9),
                new Landscape(15000, 3.0),
                new Landscape(1000, 1.3),
                new Landscape(150, 2.5)
        };

        for (Participants participant : participants) {
            for (Landscape landscape : landscapes) {

                if (participant instanceof HumanUse) {
                    participant.stop(human);
                    participant.start(human);
                    if (landscape.distant > 0) {
                        participant.runing(human);
                        participant.run(landscape.distant);
                        if (participant.Flag == false) {
                            break;
                        }
                    }
                    if (landscape.height != null) {
                        participant.jump(human);
                        participant.barier(landscape.height);
                        if (participant.Flag == false) {
                            break;
                        }
                    }

                }
                if (participant instanceof CatUse) {
                    participant.stop(cat);
                    participant.start(cat);
                    if (landscape.distant > 0) {
                        participant.runing(cat);
                        participant.run(landscape.distant);
                        if (participant.Flag == false) {
                            break;
                        }

                    }
                    if (landscape.height != null) {
                        participant.jump(cat);
                        participant.barier(landscape.height);
                        if (participant.Flag == false) {
                            break;
                        }
                    }
                }
                if (participant instanceof RobotUse) {
                    participant.stop(robot);
                    participant.start(robot);
                    if (landscape.distant > 0) {
                        participant.runing(robot);
                        participant.run(landscape.distant);
                        if (participant.Flag == false) {
                            break;
                        }
                    }
                    if (landscape.height != null) {
                        participant.jump(robot);
                        participant.barier(landscape.height);
                        if (participant.Flag == false) {
                            break;
                        }
                    }
                }

            }
        }
    }
}