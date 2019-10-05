package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        IntStream.of(numbers)
                .forEach(System.out::println);

        OptionalDouble average = IntStream.of(numbers)
                .average();
        double averageD = average.getAsDouble();


        return averageD;
    }
}
