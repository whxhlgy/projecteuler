package com.junjiezh.solutions;

public class Solution6 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            sumOfSquares += i * i;
        }
        System.out.println(sum * sum - sumOfSquares);
    }
}
