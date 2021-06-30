package com.sorrymaker.day19;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author nextGame
 * @Date 2021/6/5 9:51
 * @Version 1.0
 */
public class test03 {

    @Test
    public void test(){
        System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
    }


    public boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        HashSet set = new HashSet();
        for(char c :chars){
            set.add(c);
        }
        if(set.size()>=26){
            return true;
        }
        return false;
    }
}
