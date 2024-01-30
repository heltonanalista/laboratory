package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Min {

    public void Min() {
        List<Integer> findNumbers = Arrays.asList(45, 29, 38, 74);
        int value = findNumbers.stream().mapToInt(x->x).min().orElse(0);


        System.out.println("Printing the minimum number");
        System.out.println(value);


    }
}
