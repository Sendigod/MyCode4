package com.sorrymaker.day05;

import org.junit.Test;

/**
 * 数组异或操作。
 * @Author nextGame
 * @Date 2021/5/7 17:33
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        int n =5,start=0;
        System.out.println(xorOperation(n, start));
    }
    public int xorOperation(int n, int start) {
        int end=0;
        int[] nums =new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
            end = end ^ nums[i];
        }
        return end;
    }
}
