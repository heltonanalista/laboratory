package org.example.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MAPStream {
    public void MAP() {
        Map<Integer,String> cars = new HashMap<>();
       cars.put(1,"moday");
        cars.put(2,"tuesday");
        cars.put(3,"wednesday");
        cars.put(4,"thursday");
        cars.put(5,"friday");
        cars.put(6,"saturday");
        cars.put(7,"sunday");



cars.entrySet().stream().forEach(x->System.out.println(x));


    }
}
