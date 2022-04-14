package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StatisticsTestSuite {

    private static int testCounter = 0;

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts {

        @Test
        void testPostsEqual0() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(List.of("Adam", "Marek"));
            when(statisticsMock.commentsCount()).thenReturn(10);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(0, statisticsCounter.getPostsCount());
            assertEquals(10, statisticsCounter.getCommentsCount());
            assertEquals(2, statisticsCounter.getUserCount());
        }

        @Test
        void testPostsEqual1000() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(List.of("Joe", "Anna"));
            when(statisticsMock.commentsCount()).thenReturn(3);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(1000, statisticsCounter.getPostsCount());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestComments {

        @Test
        void testCommentsEqual0() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(List.of("Joe", "Anna"));
            when(statisticsMock.commentsCount()).thenReturn(0);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(0, statisticsCounter.getCommentsCount());
            assertEquals(1000, statisticsCounter.getPostsCount());
            assertEquals(2, statisticsCounter.getUserCount());
        }

        @Test
        void testCommentsLessThanPosts() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            when(statisticsMock.postsCount()).thenReturn(23);
            when(statisticsMock.usersNames()).thenReturn(List.of("Joe", "Anna"));
            when(statisticsMock.commentsCount()).thenReturn(2);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertTrue(statisticsCounter.getCommentsCount() < statisticsCounter.getPostsCount());
            assertEquals(2, statisticsCounter.getUserCount());
        }

        @Test
        void testCommentsMoreThanPosts() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.usersNames()).thenReturn(List.of("Joe", "Anna"));
            when(statisticsMock.commentsCount()).thenReturn(232);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertTrue(statisticsCounter.getCommentsCount() > statisticsCounter.getPostsCount());
            assertEquals(2, statisticsCounter.getUserCount());
        }
    }

    @Nested
    @DisplayName("Tests for users")
    class TestUsers {

        @Test
        void testUsersEqual0() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            List<String> userList = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(userList);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(0, statisticsCounter.getPostsCount());
            assertEquals(0, statisticsCounter.getCommentsCount());
            assertEquals(statisticsCounter.getUserCount(), userList.size());
        }

        @Test
        void testUsersEqual100() {
            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter();
            List<String> userList = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                userList.add("Person");
            }
            when(statisticsMock.usersNames()).thenReturn(userList);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(3);

            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(100, statisticsCounter.getUserCount());
            assertEquals(3, statisticsCounter.getCommentsCount());
            assertEquals(1000, statisticsCounter.getPostsCount());
        }
    }
}

