package com.sorrymaker.day06;

import org.junit.Test;

/**
 * 制作 m 束花所需的最少天数(看不懂）
 *
 * @Author nextGame
 * @Date 2021/5/9 20:18
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test1() {
        int[] bloomDay ={1,10,3,10,2};
        int m = 3, k = 1;
        System.out.println(minDays(bloomDay, m, k));

    }
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int right = 0;
        for (int num : bloomDay) {
            right = Math.max(right, num);
        }
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = count(bloomDay, mid, k);
            if (count >= m) {
                right = mid ;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int count(int[] nums, int day, int k) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day) {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                count = 0;
                res++;
            }
        }
        return res;
    }
}

