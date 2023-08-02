package Seminars.Sem005.Task001.controller;

import java.util.List;

import Seminars.Sem005.Task001.model.Student;
import Seminars.Sem005.Task001.model.Teacher;
import Seminars.Sem005.Task001.model.Type;
import Seminars.Sem005.Task001.model.User;
import Seminars.Sem005.Task001.service.UserService;
import Seminars.Sem005.Task001.view.StudentView;
import Seminars.Sem005.Task001.view.TeacherView;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacheView = new TeacherView();

    public void createStudent(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void createTeacher(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }

    public void getAllTeacher() {
        List<User> teacherList = service.readOnlyTeacher();
        for (User user : teacherList) {
            Teacher teacher = (Teacher) user;
            teacheView.printConsole(teacher);
        }
    }

}
