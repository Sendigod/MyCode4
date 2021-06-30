package com.sorrymaker.day03;

import org.junit.Test;
import sun.nio.cs.SingleByte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 给你一个数组candies和一个整数extraCandies，其中candies[i]代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的extraCandies个糖果分配给孩子们之后，此孩子有 最多的糖果。
 * 注意，允许有多个孩子同时拥有 最多的糖果数目
 * @Author nextGame
 * @Date 2021/5/5 18:59
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test1(){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Boolean> list = new ArrayList<>();
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            integers.add(candies[i]+extraCandies);
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for (int num:integers){
            if(num>=max){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
}
