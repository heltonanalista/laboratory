package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Find {

    public void find() {
        List<Integer> findNumbers = Arrays.asList(45, 29, 38, 74);
        int value = findNumbers.stream().filter(x->x>30).findFirst().orElse(30);


        System.out.println("Printing the first number found, if the number does not exist return 30");
        System.out.println(value);
         value = findNumbers.stream().filter(x->x>40).findAny().orElse(40);
        System.out.println("Printing the  number found, if the number does not exist return 40");
        System.out.println(value);

    }
}
