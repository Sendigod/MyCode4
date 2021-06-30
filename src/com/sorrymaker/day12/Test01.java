package com.sorrymaker.day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nextGame
 * @Date 2021/5/20 21:16
 * @Version 1.0
 */
public class Test01 {

    @Test
    public void test(){
        int[] numbers ={1,2};
        int[] ints = swapNumbers(numbers);
        System.out.println(ints[0]+ "+"+ ints[1]);
    }
    public int[] swapNumbers(int[] numbers) {
        return new int [] {numbers[1], numbers[0]};
    }
}
