package com.junjiezh.solutions;

public class Solution3 {
    private static final long NUMBER = 600851475143L;
    private static boolean isPrime(long num) {
        double limit = Math.floor(Math.sqrt(num));
        for (long i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
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
