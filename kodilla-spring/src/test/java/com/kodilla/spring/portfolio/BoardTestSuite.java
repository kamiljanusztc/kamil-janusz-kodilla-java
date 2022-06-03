package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Cart parameters translations");
        board.getInProgressList().addTask("New assets");
        board.getDoneList().addTask("Prototype");

        String firstTaskFromToDoList = board.getToDoList().getTasks().get(0);
        String firstTaskFromInProgressList = board.getInProgressList().getTasks().get(0);
        String firstTaskFromDoneList = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals("Cart parameters translations", firstTaskFromToDoList);
        assertEquals("New assets", firstTaskFromInProgressList);
        assertEquals("Prototype", firstTaskFromDoneList);
    }

}
