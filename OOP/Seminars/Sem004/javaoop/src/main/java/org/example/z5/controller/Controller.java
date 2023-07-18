package org.example.z5.controller;

import org.example.z5.model.Student;
import org.example.z5.model.Type;
import org.example.z5.model.User;
import org.example.z5.service.UserService;
import org.example.z5.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStuden(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}
