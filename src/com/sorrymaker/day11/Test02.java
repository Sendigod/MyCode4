package com.sorrymaker.day11;

/**
 * @Author nextGame
 * @Date 2021/5/18 20:39
 * @Version 1.0
 */
public class Test02 {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int[] sum = new int[n + 1];
        sum[0] = 0;
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        return  n;
    }
}
