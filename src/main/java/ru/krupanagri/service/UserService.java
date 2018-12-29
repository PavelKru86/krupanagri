package ru.krupanagri.service;


import ru.krupanagri.model.User;
import ru.krupanagri.to.UserTo;
import ru.krupanagri.util.exception.NotFoundException;

import java.util.List;

public interface UserService {

    User create(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    void update(User user);

    void update(UserTo user);

    List<User> getAll();

    void enable(int id, boolean enable);

    User getWithMeals(int id);
}