package com.stevenprogramming.training.lambda.core.sample;

import java.util.IntSummaryStatistics;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.stevenprogramming.training.lambda.core.Execute;
import com.stevenprogramming.training.lambda.core.sample.interfaces.LogDurationTime;
import com.stevenprogramming.training.lambda.core.util.LambdaUtil;

@LogDurationTime
public class SampleIntStream implements Execute {

    private static final Logger LOGGER = Logger.getLogger( SampleIntStream.class.getName() );

    public void printValuesInstStream(Stream values) {
        long startTime = System.nanoTime();
        values.forEach(valor -> System.out.printf("%d::", valor));
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printValuesInstStream");
    }

    public void printValues(int[] values) {
        long startTime = System.nanoTime();
        IntStream.of(values).forEach(valor -> System.out.printf("%d::", valor));
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printValues");
    }

    public void printCount(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("%nCount: " + IntStream.of(values).count());
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printCount");
    }

    public void printMin(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Min: " + IntStream.of(values).min().getAsInt());
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printMin");
    }

    public void printMax(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Max: " + IntStream.of(values).max().getAsInt());
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printMax");
    }

    public void printSum(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Sum: " + IntStream.of(values).sum());
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printSum");
    }

    public void printAverage(int[] values) {
        long startTime = System.nanoTime();
        LOGGER.info("Average: " + IntStream.of(values).average().getAsDouble());
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printAverage");
    }

    public void printStatistics(int[] values) {
        long startTime = System.nanoTime();
        IntSummaryStatistics intSummaryStatistics = IntStream.of(values).summaryStatistics();
        LOGGER.info("Statistics >>> " + intSummaryStatistics.toString());
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "");
    }

    public void printSumReduce(int[] values){
        long startTime = System.nanoTime();
        LOGGER.info("Suma de cuadrados mediante el metodo reduce " +
        IntStream.of(values)
        .reduce(0, (x, y) -> x + y * y));
        long endTime = System.nanoTime();
        LambdaUtil.printTime(startTime, endTime, LOGGER, "printSumReduce");
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
        printSumReduce(values);
        printAverage(values);
        printStatistics(values);
    }

}