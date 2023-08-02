package Seminars.Sem005.Task001;

import Seminars.Sem005.Task001.controller.Controller;

public class Outer {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Список студентов: ");
        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("qwe1", "asd1", "zxc1");
        controller.createStudent("qwe2", "asd2", "zxc2");
        controller.createStudent("qwe3", "asd3", "zxc3");
        controller.getAllStudent();

        System.out.println("Список учителей: ");
        controller.createTeacher("Oleg", "Janov", "Igorevich");
        controller.createTeacher("Oleg1", "Janov 1", "Igorevich1");
        controller.createTeacher("Oleg2", "Janov 2", "Igorevich2");
        controller.createTeacher("Oleg3", "Janov 3", "Igorevich3");
        controller.getAllTeacher();
    }
}
