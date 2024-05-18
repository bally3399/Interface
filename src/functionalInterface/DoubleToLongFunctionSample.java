package chapter17.functionalInterface;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionSample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (number) -> Double.valueOf(number).longValue();
        double result = doubleToLongFunction.applyAsLong(1.2);
        System.out.println(result);
    }
}
