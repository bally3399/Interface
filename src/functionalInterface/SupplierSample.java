package chapter17.functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());


    }
}
