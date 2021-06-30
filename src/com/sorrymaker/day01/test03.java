package com.sorrymaker.day01;

import org.junit.Test;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @Author nextGame
 * @Date 2021/5/3 21:20
 * @Version 1.0
 */
public class test03 {
    @Test
    public void test(){
        int[] nums ={1,1,2,2,3};
        int i = singleNumber(nums);
        System.out.println(i);
    }
    public int singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num = num^nums[i];
        }
        return num;
    }
}
