package org.example.z5.service;

import org.example.z5.model.Type;
import org.example.z5.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnlyStudent();
}
