package com.sorrymaker.day07;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author nextGame
 * @Date 2021/5/10 21:11
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        int n =100;
        climbStairs(n);
    }
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2, temp;
        for (int i = 3; i <= n; i++) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }
}

