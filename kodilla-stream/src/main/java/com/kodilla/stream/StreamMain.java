package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toLowerCase;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Adding a text decorator");
        poemBeautifier.beautify("Swimming", (text) -> toLowerCase(text));
        poemBeautifier.beautify("Swimming", (text) -> toUpperCase(text));
        poemBeautifier.beautify("Swimming", (text) -> "ABC " + text);
        poemBeautifier.beautify("Swimming", (text) -> "/n" + text + "/n");
        poemBeautifier.beautify("Swimming", (text) -> text + " ABC");
    }
}
