package org.example.dsa2026.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main(String[] args) {
        //Predicate is an Functional Interface which returns only boolean values

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isStringStartsWithA = s -> s.startsWith("A");
     //   System.out.println(isStringStartsWithA.test("Ankit"));
        Predicate<String> isStringEndsWithT = t -> t.endsWith("t");
       Predicate<String> concateString = isStringStartsWithA.and(isStringEndsWithT);
        System.out.println(concateString.test("Dishant"));


        // Function -> works for you
        Function<Integer, Integer> doubltIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
       // System.out.println(doubltIt.apply(20));
        System.out.println(doubltIt.andThen(tripleIt).apply(30));



    }
}
