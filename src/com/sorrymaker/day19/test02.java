package com.sorrymaker.day19;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/6/4 22:15
 * @Version 1.0
 */
public class test02 {
    @Test
    public void test() {
        System.out.println(findMaxLength(new int[]{0, 0, 0, 0, 0, 0, 0}));
    }

    public int findMaxLength(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int sum = 0;
        for (int i : nums) {
            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            }
        }
        if (count0 == nums.length || count1 == nums.length) {
            sum = nums.length;
        }
        return sum;
    }
}
