package org.example.filter;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {
    public void reducing() {
        List<String> reducingLetters= Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I","J");
        String reducedLetters= reducingLetters.stream().reduce("",(X,Y)->X+Y);

        System.out.println("Printing Reduced Letters");
        System.out.println(reducedLetters);

        List<Integer> reducingNumbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer reducedNumber= reducingNumbers.stream().reduce(0,(X,Y)->X+Y);

        System.out.println("Printing Reduced Numbers");
        System.out.println(reducedNumber);



    }

}
