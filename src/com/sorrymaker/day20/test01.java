package com.sorrymaker.day20;

/**
 * @Author nextGame
 * @Date 2021/6/6 13:39
 * @Version 1.0
 */
public class test01 {

    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        return sum;
    }
}
