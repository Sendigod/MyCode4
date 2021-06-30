package com.sorrymaker.day05;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 强整数
 * @Author nextGame
 * @Date 2021/5/7 17:50
 * @Version 1.0
 */
public class Test02 {
    @Test
    public void test() {
        int x = 3, y = 5, bound = 15;
        System.out.println(powerfulIntegers(x, y, bound));
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < bound;i *=x) {
            for (int j = 1; i + j <= bound; j *=y) {

                set.add(i + j);
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return new ArrayList<>(set);
    }
}

