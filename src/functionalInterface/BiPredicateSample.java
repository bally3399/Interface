package chapter17.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a < b;
        System.out.println(biPredicate.test(1, 2));
        BiPredicate<String, Integer> biPredicate1 = (a,  b) -> a.length() == b;
        System.out.println(biPredicate1.test("bally", 5));
    }
}
