package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public void sorting() {
        List<String> sortingNames = Arrays.asList("ana", "leticia", "pedro", "sofia", "joao", "carlos", "wilson", "bruno", "beatriz","paula");
        System.out.println("Printing sorted Names in natural order");
        sortingNames.stream().sorted().forEach(System.out::println);


        System.out.println("Printing sorted Names in reversed order");

       sortingNames.stream().sorted(Comparator.comparing(String::toString).reversed()).forEach(System.out::println);






    }

}
