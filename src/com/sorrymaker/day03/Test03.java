package com.sorrymaker.day03;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/5/5 20:07
 * @Version 1.0
 */
public class Test03 {
    @Test
    public void test(){
        int[] coins ={4,1,1};
        System.out.println(minCount(coins));
    }
    public int minCount(int[] coins) {
        int count=0;
        for (int i = 0; i < coins.length; i++) {
            count += coins[i]/2+coins[i]%2;
        }
        return count;
    }
}
