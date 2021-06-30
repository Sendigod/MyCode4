package com.sorrymaker.day23;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/6/27 10:31
 * @Version 1.0
 */
public class Test01 {

    @Test
    public void test() {
        System.out.println(searchInsert(new int[]{1}, 1));
    }

    public int searchInsert(int[] nums, int target) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                n++;
            }
        }
        return n;
    }
}
