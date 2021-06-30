package com.sorrymaker.day11;

import org.junit.Test;

/**
 * 数组累加。
 * @Author nextGame
 * @Date 2021/5/18 20:10
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        int[] nums={1,2,3,4,5};
        int[] ints = runningSum(nums);
        for(int num:ints){
            System.out.println(num);
        }
    }
    public int[] runningSum(int[] nums) {
        int[] count =new int[nums.length];
        count[0] =nums[0];
        for (int i = 1; i < nums.length; i++) {
            count[i]=count[i-1]+nums[i];
        }
        return count;
    }
}
