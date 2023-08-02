package Seminars.Sem005.Task001.service;

import java.util.List;

import Seminars.Sem005.Task001.model.Type;
import Seminars.Sem005.Task001.model.User;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnlyStudent();

    List<User> readOnlyTeacher();
}
