package com.tdd.lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class LambdaTest {
    
    @Test
    public void forEachTest() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(8);

        integers.forEach(i -> System.out.println(i));
    }

    @Test
    public void convertToUpperCase() {
        ArrayList<String> words = new ArrayList<>();
        words.add("joão");
        words.add("maria");
        words.add("pedro");

        System.out.println(words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }

    @Test
    public void oddEvenNumbers() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(String.format("%d %s", n, "Odd"));
            } else {
                System.out.println(String.format("%d %s", n, "Even"));
            }
        });
    }


}
