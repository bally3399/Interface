package chapter17.functionalInterface;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = (number) -> number * 2;
        long result = longUnaryOperator.applyAsLong(30L);
        System.out.println(result);
    }
}
