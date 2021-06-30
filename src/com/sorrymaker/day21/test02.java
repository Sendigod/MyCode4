package com.sorrymaker.day21;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/6/27 9:01
 * @Version 1.0
 */
public class test02 {

    @Test
    public void test(){
        isok(256);
    }
    public boolean isok(int n){
        if(n == 0) {
            return false;
        }
        while(n % 4 == 0){
            n /= 4;
        }
        return n == 1 ? true : false;
    }
}
