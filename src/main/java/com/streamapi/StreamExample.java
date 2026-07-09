package com.streamapi;

import java.util.*;
import java.util.stream.*;

public class StreamExample {

    public static void main(String[] args) {
        List<String> sentences= List.of("Java is powerful",
                "Streams are powerful",
                "Java Streams are easy");

        List<String> result= sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("Result: " + result);


    }
}
