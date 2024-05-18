package chapter17.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<String> unaryOperator2 = (melody) -> melody + " " +"whooped micheal ";
        System.out.println(unaryOperator2.apply("Melody"));
    }
}
