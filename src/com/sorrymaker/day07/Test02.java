package com.sorrymaker.day07;

import org.junit.Test;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 * @Author nextGame
 * @Date 2021/5/10 21:27
 * @Version 1.0
 */
public class Test02 {
    @Test
    public void test(){
        String s ="";
        System.out.println(countSegments(s));
    }
    public int countSegments(String s) {
        return (s == null || s.trim().length() == 0) ? 0 : s.trim().split("\\s+").length;
    }
}
