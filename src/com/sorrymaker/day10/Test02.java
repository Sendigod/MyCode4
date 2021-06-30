package com.sorrymaker.day10;

import org.junit.Test;

/**
 * 121,左到右121，右到左121. 返回True。
 * @Author nextGame
 * @Date 2021/5/13 21:41
 * @Version 1.0
 */
public class Test02 {

    @Test
    public void test(){
        int x=151;
        System.out.println(isPalindrome(x));
    }
    public boolean isPalindrome(int x) {
        int first=0,y=0;
        if(x>0) {
            int last=x;
            while(last!=0){
                first=last%10;
                y=y*10+first;
                last=last/10;
            }
        }
        return y==x;
    }
}
