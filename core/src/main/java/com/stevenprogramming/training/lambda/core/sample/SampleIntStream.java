package com.stevenprogramming.training.lambda.core.sample;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.stevenprogramming.training.lambda.core.Execute;

public class SampleIntStream implements Execute {

    public void printValuesInstStream(Stream values) {
        System.out.println("Values IntStream>>>>");
        values.forEach(valor -> System.out.printf("%d::", valor));
    }

    public void printValues(int[] values) {
        System.out.println("Values >>>>");
        IntStream.of(values).forEach(valor -> System.out.printf("%d::", valor));
    }

    public void printCount(int[] values) {
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
    }

    public void printMin(int[] values) {
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
    }

    public void printMax(int[] values) {
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
    }

    public void printSum(int[] values) {
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
    }

    public void printAverage(int[] values) {
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
    }

    public void printStatistics(int[] values) {
        IntSummaryStatistics intSummaryStatistics = IntStream.of(values).summaryStatistics();
        System.out.println("Statistics >>> " + intSummaryStatistics.toString());
    }

    @Override
    public void execute() {
        int[] values = {1, 11, 16, 3, 4, 8, 2, 5, 19, 21};
        printValuesInstStream(IntStream.range(0, 20).boxed());
        printValues(values);
        printCount(values);
        printMin(values);
        printMax(values);
        printSum(values);
        printAverage(values);
        printStatistics(values);
    }

}