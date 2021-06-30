package com.sorrymaker.day01;

import org.junit.Test;

/**
 * 给定一个包含 `n + 1` 个整数的数组 `nums` ，其数字都在 `1` 到 `n` 之间（包括 `1` 和 `n`），可知至少存在一个重复的整数。
 * 假设 `nums` 只有 **一个重复的整数** ，找出 **这个重复的数** 。
 * @Author nextGame
 * @Date 2021/5/3 16:54
 * @Version 1.0
 */
public class test02 {
    @Test
    public void test(){
        int[] nums ={1,2,3,4,1,6,7,8,9,1};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        do{
            slow = nums[slow];
            //这里不是一次跳两格，而是一次走两步的意思，所以一定会遇到重复项走回起点，
            fast = nums[fast];
            fast = nums[fast];
        }while (slow!=fast);
        slow =0;
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
