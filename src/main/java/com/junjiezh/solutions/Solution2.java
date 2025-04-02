package com.junjiezh.solutions;

public class Solution2 {
    public static void main(String[] args) {
        int first = 1, second = 2, sum = 0;
        while (first < 4000_000) {
            if (first % 2 == 0) {
                sum += first;
            }
            int temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println(sum);
    }
}
