package chapter17.functionalInterface;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> function = (number, num) -> number * num;
        System.out.println(function.applyAsInt(1, 2));

        ToIntBiFunction<String, Integer> function2 = (name, number2) -> name.length() * number2;
        System.out.println(function2.applyAsInt("abc", 2));

    }
}
