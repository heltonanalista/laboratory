package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Skip {

    public void skip() {
        List<Integer> skipNumbers= Arrays.asList(1,2,3,4,5,6,7,8,9);

skipNumbers.stream().skip(4).forEach(System.out::println);



    }
}
