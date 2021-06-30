package com.sorrymaker.day18;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/5/30 19:06
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test() {
        System.out.println(isPowerOfTwo(8));
    }

    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1))==0 ;

    }
}
