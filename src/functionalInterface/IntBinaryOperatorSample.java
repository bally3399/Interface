package chapter17.functionalInterface;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSample {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = Integer::sum;
        int sum = intBinaryOperator.applyAsInt(1, 2);
        System.out.println(sum);

        IntBinaryOperator intBinaryOperator2 = (num1, num2) -> num1 - num2;
        int subtract = intBinaryOperator2.applyAsInt(1, 2);
        System.out.println(subtract);

        IntBinaryOperator intBinaryOperator3 = (num1, num2) -> num1 % num2;
        int divide = intBinaryOperator3.applyAsInt(1, 2);
        System.out.println(divide);
    }
}
