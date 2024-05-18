package chapter17.functionalInterface;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = (name) -> name.length();
        int result = toIntFunction.applyAsInt("bally");
        System.out.println(result);


    }
}
