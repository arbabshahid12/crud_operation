package com.crud.crudApplication.services;

import com.crud.crudApplication.entities.User;
import com.crud.crudApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public Optional<User> findById(int id) {
        return userRepository.findById((long) id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(int id) {
        userRepository.deleteById((long) id);
    }
}


