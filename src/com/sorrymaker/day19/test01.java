package com.sorrymaker.day19;

import org.junit.Test;

/**
 * 1+...+n,不用for if之类的循环。等差数列公式往上套。
 * @Author nextGame
 * @Date 2021/6/4 22:04
 * @Version 1.0
 */
public class test01 {

    @Test
    public void test(){
        System.out.println(sumNums(9));
    }

    public int sumNums(int n) {
        return n+(n*(n-1))/2;
    }
}
