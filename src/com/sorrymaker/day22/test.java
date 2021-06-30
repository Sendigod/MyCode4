package com.sorrymaker.day22;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/6/23 17:47
 * @Version 1.0
 */
public class test {

    @Test
    public void test(){
        System.out.println(hammingWeight(4));
    }
    public int hammingWeight(int n) {
        int count=0;
        String string = Integer.toBinaryString(n);
        char[] chars = string.toCharArray();
        for(char c:chars){
            if(c==49){
                count++;
            }
        }
        return count;
    }
}
