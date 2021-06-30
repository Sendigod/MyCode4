package com.sorrymaker.day13;

import org.junit.Test;

import java.util.*;

/**
 * @Author nextGame
 * @Date 2021/5/21 19:47
 * @Version 1.0
 */
public class words {
    @Test
    public void test() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        topKFrequent(words, k);
    }

    public List<String> topKFrequent(String[] words, int k) {
        // 1.先用哈希表统计单词出现的频率
        Map<String, Integer> count = new HashMap();
        for (String word : words) {
            //默认是没出现，一出现就加一。
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        // 2.用 list 存储字符 key 然后自定义 Comparator 比较器对 value 进行排序。
        List<String> candidates = new ArrayList<>(count.keySet());

        candidates.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (count.get(a).equals(count.get(b))) {
                    return a.compareTo(b);
                } else {
                    return count.get(b) - count.get(a);
                }
            }
        });
        // 3.截取前 K 大个高频单词返回结果。
        return candidates.subList(0, k);
    }
}
