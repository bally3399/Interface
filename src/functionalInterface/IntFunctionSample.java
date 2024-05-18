package chapter17.functionalInterface;

import java.util.function.IntFunction;

public class IntFunctionSample {
    public static void main(String[] args) {
        IntFunction<Integer> function = (number) -> number * number;
        System.out.println(function.apply(5));

        IntFunction<Integer> function2 = (number) -> number + number;
        int sum = function2.apply(5);
        System.out.println(sum);

        IntFunction<Integer> function3 = (number) -> number - number;
        int subtract = function3.apply(5);
        System.out.println(subtract);
    }
}
