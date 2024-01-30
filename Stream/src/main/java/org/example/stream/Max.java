package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Max {

    public void Max() {
        List<Integer> findNumbers = Arrays.asList(45, 29, 38, 74);
        int value = findNumbers.stream().mapToInt(x->x).max().orElse(0);


        System.out.println("Printing the maximum number");
        System.out.println(value);
        value = findNumbers.stream().mapToInt(x->x).min().orElse(0);

    }
}
