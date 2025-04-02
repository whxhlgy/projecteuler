package com.junjiezh.solutions;

public class Solution4 {
    private static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        int start = 100, end = 999;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                if (isPalindrome(i * j)) {
                    max = Math.max(max, i * j);
                }
            }
        }
        System.out.println(max);
    }
}
