package chapter17.functionalInterface;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {
    public static void main(String[] args) {
        ToLongBiFunction<Integer, Integer> function = Integer::sum;
        long result = function.applyAsLong(1, 2);
        System.out.println(result);
    }

}
