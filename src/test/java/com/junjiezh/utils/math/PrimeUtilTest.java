package com.junjiezh.utils.math;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeUtilTest {

    @Test
    public void isPrime() {
        // 测试素数
        assertTrue(PrimeUtil.isPrime(2));
        assertTrue(PrimeUtil.isPrime(3));
        assertTrue(PrimeUtil.isPrime(5));
        assertTrue(PrimeUtil.isPrime(7));
        assertTrue(PrimeUtil.isPrime(11));
        assertTrue(PrimeUtil.isPrime(13));
        assertTrue(PrimeUtil.isPrime(17));
        assertTrue(PrimeUtil.isPrime(19));
        assertTrue(PrimeUtil.isPrime(23));
        assertTrue(PrimeUtil.isPrime(29));
        assertTrue(PrimeUtil.isPrime(97));
        assertTrue(PrimeUtil.isPrime(101));
        
        // 测试非素数
        assertFalse(PrimeUtil.isPrime(1));  // 1不是素数
        assertFalse(PrimeUtil.isPrime(4));
        assertFalse(PrimeUtil.isPrime(6));
        assertFalse(PrimeUtil.isPrime(8));
        assertFalse(PrimeUtil.isPrime(9));
        assertFalse(PrimeUtil.isPrime(10));
        assertFalse(PrimeUtil.isPrime(12));
        assertFalse(PrimeUtil.isPrime(15));
        assertFalse(PrimeUtil.isPrime(25));
        assertFalse(PrimeUtil.isPrime(100));
        
        // 测试不同数值类型
        assertTrue(PrimeUtil.isPrime(17L));
        assertTrue(PrimeUtil.isPrime(17.0));
        assertTrue(PrimeUtil.isPrime(17.0f));
        
        // 测试大数
        assertTrue(PrimeUtil.isPrime(10007));
        assertFalse(PrimeUtil.isPrime(10000));
    }
}