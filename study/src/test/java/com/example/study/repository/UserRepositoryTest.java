package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser10");
        user.setEmail("TestUser08@gmail.com");
        user.setPhoneNumber("010-1010-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("user10");

        User newUser = userRepository.save(user);

        System.out.println("newUser " + newUser);
    }

    @Test
    public void read() {
        Optional<User> user = userRepository.findById(9L);

        user.ifPresent(selectedUser -> {
            System.out.println("user: " + selectedUser);
        });

    }

    @Test
    @Transactional
    public void update() {
        Optional<User> user = userRepository.findById(9L);

        user.ifPresent(selectedUser -> {
            selectedUser.setAccount("This is USER 9");
            selectedUser.setUpdatedAt(LocalDateTime.now());
            selectedUser.setUpdatedBy("update method");

            userRepository.save(selectedUser);
        });
    }

    @Test
    @Transactional
    public void delete() {
        Optional<User> user = userRepository.findById(12L);

        Assertions.assertTrue(user.isPresent());  // true

        user.ifPresent(selectedUser -> {
            userRepository.deleteById(12L);
        });

        Optional<User> deletedUser = userRepository.findById(8L);

        Assertions.assertFalse(deletedUser.isPresent());  // false
    }

}
