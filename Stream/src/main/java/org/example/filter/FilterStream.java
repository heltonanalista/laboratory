package org.example.filter;

import java.util.Arrays;
import java.util.List;

public class FilterStream {
public void filtering() {
    List<String> filteringNames = Arrays.asList("ana", "leticia", "pedro", "sofia", "joao", "carlos", "wilson", "bruno", "beatriz","paula");
    List<String> resultsNames = filteringNames.stream().filter(name -> name.startsWith("b")).toList();

    System.out.println("Printing Filtered Names that start with the letter b ");
    System.out.println(resultsNames);

    resultsNames = filteringNames.stream().filter(name -> name.endsWith("z")).toList();
    System.out.println("Printing Filtered Names that end with the letter z ");
    System.out.println(resultsNames);

    resultsNames = filteringNames.stream().filter(name -> name.startsWith("a") && name.endsWith("a")).toList();
    System.out.println("Printing Filtered Names that start and end with the letter a ");
    System.out.println(resultsNames);
}
}
