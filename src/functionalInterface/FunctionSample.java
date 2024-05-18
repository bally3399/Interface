package chapter17.functionalInterface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("hello"));
    }
}
