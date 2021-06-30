package com.sorrymaker.day04;

import org.junit.Test;

/**
 *
 * 整数反转
 * @Author nextGame
 * @Date 2021/5/6 20:36
 * @Version 1.0
 */
public class Test03 {

    @Test
    public void test() {
        int x = 0;
        reverse(x);
    }

    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
