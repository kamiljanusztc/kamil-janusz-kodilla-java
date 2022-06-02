package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername() {

        //Given
        ApplicationContext context = 
                new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.username;

        //Then
        assertEquals("John Smith", name);
    }
}
