//package com.kodilla.testing.forum.statistics;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class StatisticsTestSuite {
//
//    private static int testCounter = 0;
//
//    @Mock
//    private Statistics statisticsMock;
//
//    @BeforeEach
//    public void beforeEveryTest() {
//        testCounter++;
//        System.out.println("Preparing to execute test #" + testCounter);
//    }
//
//    @Nested
//    @DisplayName("Tests for posts")
//    class TestPosts {
//
//        @Test
//        void testPostsEqual0() {
//            // Given
//            StatisticsCounter statisticsCounter = new StatisticsCounter();
//            when(statisticsMock.postsCount()).thenReturn(0);
//            statisticsCounter.calculateAdvStatistics(statisticsMock);
//
//            // When
//
//
//            // Then
//        }
//
//        @Test
//        void testPostsEqual1000() {
//            // Given
//            // When
//            // Then
//        }
//    }
//
//    @Nested
//    @DisplayName("Tests for comments")
//    class TestComments {
//
//        @Test
//        void testCommentsEqual0() {
//            // Given
//            // When
//            // Then
//        }
//
//        @Test
//        void testCommentsLessThanPosts() {
//            // Given
//            // When
//            // Then
//        }
//
//        @Test
//        void testCommentsMoreThanPosts() {
//            // Given
//            // When
//            // Then
//        }
//    }
//
//    @Nested
//    @DisplayName("Tests for users")
//    class TestUsers {
//
//        @Test
//        void testUsersEqual0() {
//            // Given
//            // When
//            // Then
//        }
//
//        @Test
//        void testUsersEqual100() {
//            // Given
//            // When
//            // Then
//        }
//    }
//}
//
