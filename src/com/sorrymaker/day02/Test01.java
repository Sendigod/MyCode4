package com.sorrymaker.day02;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定字符串`J` 代表石头中宝石的类型，和字符串 `S`代表你拥有的石头。
 * `S` 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * `J` 中的字母不重复，`J` 和 `S`中的所有字符都是字母。
 * 字母区分大小写，因此`"a"`和`"A"`是不同类型的石头
 * @Author nextGame
 * @Date 2021/5/4 19:46
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test(){
        String jewls ="abc";
        String stones ="aAAAbbbCD";
        int i = numJewelsInStones(jewls, stones);
        System.out.println(i);
    }
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            set.add(c);
        }
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if(set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
