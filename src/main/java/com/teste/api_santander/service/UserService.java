package com.teste.api_santander.service;

import com.teste.api_santander.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
