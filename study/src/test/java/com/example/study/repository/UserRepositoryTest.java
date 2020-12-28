package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

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

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

}
