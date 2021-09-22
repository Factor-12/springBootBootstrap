package ru.fedorov.springbootbootstrap.dao;

import ru.fedorov.springbootbootstrap.model.User;

public interface UserRepositoryCustom {
    User findOneWithRoles(String email);
}
