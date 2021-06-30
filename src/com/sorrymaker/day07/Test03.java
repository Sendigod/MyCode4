package com.sorrymaker.day07;

import org.junit.Test;

import java.util.Arrays;

/**
 * 高度检查器
 * @Author nextGame
 * @Date 2021/5/10 21:39
 * @Version 1.0
 */
public class Test03 {
    @Test
    public void test(){
        int[] heights ={5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }
    public int heightChecker(int[] heights) {
        //复制一个新的数组，包括数据和数组长度
        int[] nums = Arrays.copyOf(heights, heights.length);

        //新数组进行排序
        Arrays.sort(nums);
        int count = 0;

        //对比新数组和高度数组同个下标的数字，不一样的话就count++
        for (int i = 0; i < nums.length; i++) {
            if (heights[i] != nums[i]) {
                count++;
            }
        }
        return count;
    }
}
