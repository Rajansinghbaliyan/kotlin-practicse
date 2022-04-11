package javacode;

import java.util.Arrays;
import java.util.List;

public class PrintNames {
    public void printNames(String [] names){
        Arrays.stream(names)
                .forEach(System.out::println);
    }

    public void printIntegers(int [] numbers){
        Arrays.stream(numbers)
                .forEach(System.out::println);
    }

    public void printArrayListInt(List<Integer> numbers){
        numbers.forEach(System.out::println);
    }
}
