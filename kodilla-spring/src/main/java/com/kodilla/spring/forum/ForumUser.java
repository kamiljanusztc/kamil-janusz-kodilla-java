package com.kodilla.spring.forum;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ForumUser {

    String username;

    public ForumUser() {
        this.username = "John Smith";
    }
}
