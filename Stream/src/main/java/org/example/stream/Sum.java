package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sum {
    public void sum() {
        List<Integer> sumNumbers = Arrays.asList(45, 29, 38, 74);
        int value = sumNumbers.stream().mapToInt(x -> x.intValue()).sum();


        System.out.println("Printing the sum of numbers");
        System.out.println(value);


    }
}