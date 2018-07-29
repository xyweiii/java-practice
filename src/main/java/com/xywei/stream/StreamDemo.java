package com.xywei.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamDemo {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        List<Integer> numbers = Arrays.asList(100, 1, 2, 3, 4, 5, 6, 7, 8);


        numbers.stream()
                .filter(t -> t >= 5)
                .findAny()
                .ifPresent(System.out::println);


        List<Integer> twoEvenSquares =
                numbers.parallelStream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2)
                        .collect(toList());

        boolean expensive =
                twoEvenSquares.stream()
                        .allMatch(t -> t > 100);

        System.out.println(expensive);


        //reduce

        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
        List<Integer> wordLengths =
                words.stream()
                        .map(String::length)
                        .collect(toList());
        wordLengths.forEach(System.out::println);

        int product = numbers.stream().reduce(0, Integer::sum);
        System.out.println(product);


        //sum
        int statementSum =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum(); // works!

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }


}
