package com.sorrymaker.day08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author nextGame
 * @Date 2021/5/11 20:14
 * @Version 1.0
 */
public class Test01 {
    @Test
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = wall.size();
        for(List<Integer> list : wall){
            int sum = 0;
            for(int num : list){
                sum += num;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            map.put(sum,0);
        }
        for(Integer num : map.values()){
            len = Math.min(len,wall.size()-num);
        }
        return len;
    }
}
