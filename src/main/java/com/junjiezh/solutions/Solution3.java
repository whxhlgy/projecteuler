package com.junjiezh.solutions;

import static com.junjiezh.utils.math.PrimeUtil.isPrime;

public class Solution3 {
    private static final long NUMBER = 600851475143L;
    public static void main(String[] args) {
        long limit = (long) Math.floor(Math.sqrt(NUMBER));
        long max = Long.MIN_VALUE;
        for (int i = 2; i < limit; i++) {
            if (NUMBER % i == 0) {
                if (isPrime(i)) {
                    max = Math.max(max, i);
                }
                if (isPrime(NUMBER / i)) {
                    max = Math.max(max, NUMBER / i);
                }
            }
        }
        System.out.println(max);
    }
}
