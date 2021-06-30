package com.sorrymaker.day21;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/6/27 8:46
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        System.out.println(isPowerOfFour(256));
    }

    public boolean isPowerOfFour(int n) {
        int n1=n,i=0;
        if(n==1|n==4){
            return true;
        }
        while (n1>1){
            n1=n1/4;
            i++;
        }
        double i1 = Math.pow(4,i);
        if(i1==n){
            return true;
        }
        return false;
    }
}
