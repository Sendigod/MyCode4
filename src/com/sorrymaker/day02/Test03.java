package com.sorrymaker.day02;

import org.junit.Test;

import java.util.Arrays;

/**
 * 给你一个整数数组 `nums` 。
 * 如果一组数字 `(i,j)` 满足 `nums[i]` == `nums[j]` 且 `i` < `j` ，就可以认为这是一组 **好数对** 。
 * 返回好数对的数目。
 * @Author nextGame
 * @Date 2021/5/4 20:29
 * @Version 1.0
 */
public class Test03 {

    @Test
    public void test(){
        int[] nums ={1,1,1,1,1,1,1};
        int i = numIdenticalPairs(nums);
        System.out.println(i);
    }
    public int numIdenticalPairs(int[] nums) {

            int[] cnt = new int[101];
            int ans = 0;
            for (int num : nums) {
                ans += cnt[num];
                cnt[num]++;
            }
            return ans;
        }
}
