package com.sorrymaker.day17;

import org.junit.Test;

/**
 * @Author nextGame
 * @Date 2021/5/27 21:14
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        int x=93,y=73;
        System.out.println(hammingDistance(x, y));
    }

    public int hammingDistance(int x, int y) {
        int count=0;
        if(x==y) {
            return 0;
        }
        while(x!=0||y!=0){
            if(x%2!=y%2) {
                count++;
            }
            x=x/2;
            y=y/2;
        }
        return count;
    }
}
