package se.lexicon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamExercises {
    public static void main(String[] args) {
        ex4();
    }

   //calculate the average of a list of integers using streams.
    public static void ex1(){
        //Stream<Integer> integerStream = Stream.of(1, 2, 4, 6, 8, 9, 0);

        List<Integer> numbers = Arrays.asList(2, 100, 12, 100000, 20000);
        System.out.println("List of numbers :" + numbers);
        // Calculate the average using streams
        double average = numbers
                .stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average value of the said numbers: " + average);


    }

    public static void ex2(){
        //to convert a list of strings
        // to uppercase or lowercase using streams.

        List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        System.out.println("List of strings: " + colors);
        // Convert strings to uppercase using streams
        List < String > uppercaseStrings = colors
                .stream()
                .map(String :: toUpperCase)
                .collect(Collectors.toList());
        System.out.println( "List to upper case :" + uppercaseStrings);

        // Convert strings to lowercase using streams

        List<String> toLowerCase = colors
                .stream()
                .map(String :: toLowerCase)
                .collect(Collectors.toList());
        System.out.println("List to lower case :" + toLowerCase);

    }

    public static void ex3(){
        // calculate the sum of all even, odd numbers in a list using streams.

        List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sum of even numbers
        int sumOfEvenNumbers = numbers
                .stream()
                .filter(numb -> numb % 2 == 0)//Filters elements based on a specified condition.
                .mapToInt(Integer::intValue)
                .sum();
        int sumOfOddNumbers = numbers
                .stream()
                .filter(num -> num % 2 != 0)//Filters elements based on a specified condition.
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers :" +sumOfEvenNumbers );
        System.out.println("Sum of odd number :" + sumOfOddNumbers);

    }

    public static void ex4(){
        //remove all duplicate elements from a list using streams.
        List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("List of integer :" + nums);


        // Remove duplicates

        List < Integer > distinctNumbers = nums
                .stream()
                .distinct()//Removes duplicate elements from the stream.
                .collect(Collectors.toList());

        System.out.println("List without duplicate : " + distinctNumbers);
    }

    public static void ex5(){
        
    }





}
