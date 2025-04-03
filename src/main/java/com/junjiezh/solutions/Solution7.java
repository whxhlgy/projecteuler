package com.junjiezh.solutions;

import static com.junjiezh.utils.math.PrimeUtil.isPrime;

public class Solution7 {
    public static void main(String[] args) {
        long nb = 2;
        long lastPrime = nb;
        int nthPrime = 10001;
        for (int i = 0; i < nthPrime; i++) {
            while(!isPrime(nb)) {
                nb++;
            }
            lastPrime = nb;
            nb++;
        }
        System.out.println(lastPrime);
    }
}
