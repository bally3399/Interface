package chapter17.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumeExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word) -> { //x represent the parameter of the lambda
            System.out.println("You have entered: " +word);
            System.out.println("I am printing: " +word);
        };
       List<String> names = List.of("john", "Joe", "johnny");
                names.forEach(consumer);
    }

}
