package com.sorrymaker.day04;

import org.junit.Test;

import java.util.ArrayList;

/**
 *  解码异或后的数组
 * @Author nextGame
 * @Date 2021/5/6 19:10
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        int[] encdoded ={1,2,3};
        int first =1;
        decode(encdoded, first);
    }
    public int[] decode(int[] encoded, int first) {
        int[] arr =new int[encoded.length+1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i+1] = encoded[i]^arr[i];
        }
        return arr;
    }
}
