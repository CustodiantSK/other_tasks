package Seminars.Sem005.Task001;

import Seminars.Sem005.Task001.controller.Controller;

public class Outer {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("qwe1", "asd1", "zxc1");
        controller.createStudent("qwe2", "asd2", "zxc2");
        controller.createStudent("qwe3", "asd3", "zxc3");
        controller.getAllStudent();
    }
}
