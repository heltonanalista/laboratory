package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Count {

    public void count() {
        List<Integer> countNumbers = Arrays.asList(45, 29, 38, 74,5);
        Long value = countNumbers.stream().mapToInt(x->x).count();


        System.out.println("Printing the  numbers of elements contained in the list ");
        System.out.println(value);


    }
}
