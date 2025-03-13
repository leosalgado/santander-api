package com.teste.api_santander.service;

import com.teste.api_santander.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User create(User userToCreate);
}
