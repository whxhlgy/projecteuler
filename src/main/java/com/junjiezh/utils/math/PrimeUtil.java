package com.junjiezh.utils.math;

public class PrimeUtil {

    public static <T extends Number> boolean isPrime(T nb) {
        double d = nb.doubleValue();

        if (d == 1) {
            return false;
        }
        int top = (int) Math.sqrt(d);
        for (int i = 2; i <= top; i++) {
            if (d % i == 0) {
                return false;
            }
        }
        return true;
    }
}
