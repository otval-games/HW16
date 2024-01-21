package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HWStreamAPI {

    public static IntStream createList(int a, int b, int c, int d, int e){
        IntStream intList = IntStream.of(a, b, c, d, e);

        return intList;
    }

    public static int sumEvenNums() {

        IntStream intList = createList(-5, -2, 1, 3, 4);
        return intList.filter(i -> i%2 == 0).sum();
    }

    public static void multByTwo(){
        IntStream intList = createList(-5, -2, 1, 3, 4);
        intList.map(i -> i * 2).forEach(System.out::println);
    }

    public static int findMax(){
        IntStream intList = createList(-5, -2, 1, 3, 4);
        return intList.max().getAsInt();
    }

    public static void findOddNums(){
        IntStream intList = createList(-5, -2, 1, 3, 4);
        intList.filter(i -> i % 2 != 0).forEach(x -> {System.out.print(x+", ");});
    }

    public static double findAvg(){
        IntStream intList = createList(-5, -2, 1, 3, 4);
        return intList.average().getAsDouble();
    }

    public static List<Integer> findByStream(Integer[] arr) {
        return Arrays.stream(arr).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}