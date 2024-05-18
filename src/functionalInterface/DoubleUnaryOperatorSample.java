package chapter17.functionalInterface;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorSample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = (number) -> number * 2;
        double result = doubleUnaryOperator.applyAsDouble(1);
        System.out.println(result);
    }
}
