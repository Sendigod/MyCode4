package com.sorrymaker.day14;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/5/24 21:02
 * @Version 1.0
 */
public class Test01 {

    @Test
    public void test(){
        int n =4;
        System.out.println(Fibonacci(4));
    }

    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
          return (Fibonacci(n-1) + Fibonacci(n-2));
        }
    }
}
