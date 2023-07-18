package org.example.z5;

import org.example.z5.controller.Controller;

public class Outer {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStuden("qwe","asd","zxc");
        controller.createStuden("qwe","asd","zxc");
        controller.createStuden("qwe","asd","zxc");
        controller.getAllStudent();
    }

}
