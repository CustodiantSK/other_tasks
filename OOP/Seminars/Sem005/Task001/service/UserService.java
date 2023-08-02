package Seminars.Sem005.Task001.service;

import java.util.ArrayList;
import java.util.List;
// import java.util.UUID;

import Seminars.Sem005.Task001.model.Student;
import Seminars.Sem005.Task001.model.Teacher;
import Seminars.Sem005.Task001.model.Type;
import Seminars.Sem005.Task001.model.User;

public class UserService implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patron, Type type) {
        // UUID qwe = UUID.randomUUID();
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            userList.add(new Student(name, surname, patron, id));
        }
        if (Type.TEACHER == type) {
            userList.add(new Teacher(name, surname, patron, id));
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;

        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (user instanceof Student && isStudent) {
                lastId++;
            }

        }
        return ++lastId;

    }

    @Override
    public List<User> read() {
        return userList;
    }

    public List<User> readOnlyStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }

    public List<User> readOnlyTeacher() {
        List<User> teachers = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher) {
                teachers.add(user);
            }
        }
        return teachers;
    }

}
