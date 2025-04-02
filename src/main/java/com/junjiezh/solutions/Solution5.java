package com.junjiezh.solutions;

public class Solution5 {
    private static boolean isDivisible(int num) {
        for (int i = 1; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int nb = 20; nb < Integer.MAX_VALUE; nb++) {
            if (isDivisible(nb)) {
                System.out.println(nb);
                break;
            }
        }
    }
}
