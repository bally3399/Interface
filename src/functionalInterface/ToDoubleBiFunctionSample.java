package chapter17.functionalInterface;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionSample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (num1, num2) -> num1 * num2;
        double result = toDoubleBiFunction.applyAsDouble(15, 2);
        System.out.println(result);


        ToDoubleBiFunction<Integer, String> toDoubleBiFunction1 = (num1, num2) -> num1 * num2.length();
        double result1 = toDoubleBiFunction1.applyAsDouble(3, "bimbim");
        System.out.println(result1);
    }
}
