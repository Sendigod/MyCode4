package com.sorrymaker.day14;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/5/24 21:06
 * @Version 1.0
 */
public class Test02 {

    @Test
    public void test(){
        String str="abcdefg";
        System.out.println(solve(str));
    }
    public String solve (String str) {
//        int j=0;
//        char[] chars = str.toCharArray();
//        char[] c1 = new char[chars.length];
//        for (int i = chars.length-1; i >=0; i--) {
//            c1[j++]=chars[i];
//        }
//        return String.valueOf(c1);
        return new StringBuilder(str).reverse().toString();
    }

}
