package se.lexicon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {

        ex2();

    }

    // Terminal Operation
    // count()
    public static void ex1(){


        Stream<String> skills = Stream.of("Java", "C#", "ReactJS", "Python");
         long count = skills.count();
        System.out.println("count = " + count);
    }
    // Terminal Operation
    // max() & min()
    public static void ex2(){
        Stream<Integer> integerStream = Stream.of(1, 2, 4, 6, 8, 9, 0);
        Stream<String> emptyStream = Stream.empty();

        List<Integer> numbers = Arrays.asList(2, 100, 12, 100000, 20000);

    }
}
