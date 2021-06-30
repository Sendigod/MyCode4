package com.sorrymaker.day04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 有多少小于当前数字的数字
 * @Author nextGame
 * @Date 2021/5/6 19:41
 * @Version 1.0
 */
public class Test02 {
    @Test
    public void test(){
        int[] nums ={8,1,2,2,3};
        int[] ints = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts =new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]);
        }
        for (int j = 0; j < nums.length; j++) {
            Iterator<Integer> iterator = list.iterator();
            int count=0;
            while (iterator.hasNext()){
                Integer integer = iterator.next();
                if(nums[j]>integer){
                    count++;
                }
                counts[j] =count;
            }
        }
        return counts;
    }
}
