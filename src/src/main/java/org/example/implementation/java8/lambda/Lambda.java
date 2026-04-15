package org.example.implementation.java8.lambda;

import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
       MathOperation mathOperation = (int a, int b) -> a + b;
       MathOperation mathOperation1 = (int a, int b) -> a - b;
        int res = mathOperation.operate(1, 2);
        System.out.println(res);

        // Predicate (Boolean valued Funcion)
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(4));
        Predicate<String> isStringStartingWithA = x -> x.toLowerCase().startsWith("d");
        Predicate<String> isStringEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isStringStartingWithA.and(isStringEndingWithT);
        System.out.println(and.test("Dishant"));


    }
}
@FunctionalInterface
interface MathOperation{
   public int operate(int a, int b);
}