package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Limit {
    public void limit() {
        List<Integer> skipNumbers= Arrays.asList(1,2,3,4,5,6,7,8,9);

        skipNumbers.stream().limit(5).forEach(System.out::println);



    }
}
