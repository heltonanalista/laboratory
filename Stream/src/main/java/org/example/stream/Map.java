package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Map {

    public void maping() {
        List<String> mapingNames = Arrays.asList("ana", "leticia", "pedro", "sofia", "joao", "carlos", "wilson", "bruno", "beatriz", "paula");
        System.out.println("Printing mapped names to Upper case");
        mapingNames.stream().map(String::toUpperCase).forEach(System.out::println);


    }}
