package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("TDD: Shape Collector Test Suite")
    class ShapeCollectorTestSite {

        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

        @Test
        void testAddFigure() {
//            Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2.2);

//            When
            shapeCollector.addFigure(circle);

//            Then
            Assertions.assertEquals(1, shapeCollector.getShapeQuantity());
        }

        @Test
        void testRemoveFigure() {
//            Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3.2);
            shapeCollector.addFigure(triangle);

//            When
            boolean result = shapeCollector.removeFigure(triangle);

//            Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeQuantity());

        }

        @Test
        void testGetFigure() {
//            Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4.0);
            shapeCollector.addFigure(square);

//            When
            Square retrievedShape;
            retrievedShape = (Square) shapeCollector.getFigure(0);

//            Then
            Assertions.assertEquals(square, retrievedShape);

        }

        @Test
        void testShowFigures() {
//            Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(1.1);
            Square square = new Square(2.0);
            Triangle triangle = new Triangle(3.4);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            List<Shape> shapeList= new ArrayList<>(Arrays.asList (circle, square, triangle));

//            When
            List<Shape> expectedShapeList = shapeCollector.getShapeCollection();

//            Then
            Assertions.assertEquals(shapeList.toString(), expectedShapeList.toString());

        }

    }

}
