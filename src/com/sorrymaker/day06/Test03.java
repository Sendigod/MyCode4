package com.sorrymaker.day06;

import org.junit.Test;

/**
 * 速算机器人,有点侮辱智商了
 * @Author nextGame
 * @Date 2021/5/9 21:07
 * @Version 1.0
 */
public class Test03 {
    @Test
    public void test(){
        System.out.println(calculate("AB"));
    }
    public int calculate(String s) {
        int x=1,y=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                x = 2 * x + y;
            }else if(s.charAt(i)=='B'){
                y = 2 * y + x;
            }
        }
        return x+y;
    }
}
