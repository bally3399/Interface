package chapter17.functionalInterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierSample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = () -> false;
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
