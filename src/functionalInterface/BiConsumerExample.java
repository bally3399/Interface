package chapter17.functionalInterface;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age) -> { //x represent the parameter of the lambda
            printFullName(name, age);

        };
        biConsumer.accept("Femi", 25);
        Map<String, Integer> map =Map.of(
                "john", 1,
                "femi", 2,
                "titi", 3);
        map.forEach(biConsumer);

    }
    private static void printFullName(String name, int age) {
        System.out.println(name+ " " + age);
    }



}
