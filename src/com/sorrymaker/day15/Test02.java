package com.sorrymaker.day15;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/5/25 21:21
 * @Version 1.0
 */
public class Test02 {
    @Test

    public void test() {
        String s = "011000111";
        System.out.println(checkZeroOnes(s));
    }

    public boolean checkZeroOnes(String s) {
        int maxLen_0 =0;
        for(String s1:s.split("1")){
            maxLen_0 = Math.max(s1.length(),maxLen_0);
        }
        int maxLen_1=0;
        for(String s2:s.split("0")){
            maxLen_1 = Math.max(s2.length(),maxLen_1);
        }
        return maxLen_1>maxLen_0;
    }
}
