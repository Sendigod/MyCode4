package com.sorrymaker.day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 用栈操作构建数组
 * @Author nextGame
 * @Date 2021/5/9 20:44
 * @Version 1.0
 */
public class Test02 {
    @Test
    public void test(){
        int[] target = {2,3,4};
        int n =4;
        System.out.println(buildArray(target, n));
    }
    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();
        for (int i = 0,j=1; i <target.length; i++,j++) {
            if(j == target[i]){
                list.add("Push");
            }else{
                list.add("Push");
                list.add("Pop");
                i--;
            }
        }
        return list;
    }
}

