package com.sorrymaker.day09;

import org.junit.Test;

/**
 * 子数组异或查询,难度中等，自己存粹想出来的，好爽啊啊啊啊啊啊啊啊啊啊。
 * @Author nextGame
 * @Date 2021/5/12 21:01
 * @Version 1.0
 */
public class Test01 {
    @Test
    public void test() {
        int[] arr = {1, 11, 1};
        int[][] queries = {{0, 2}, {0, 2}, {2, 2}, {0, 2}};
        int[] ints = xorQueries(arr, queries);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] count = new int[queries.length];
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < queries.length; i++) {
            for (int i1 = 0; i1 < queries[i].length; i1++) {
                num1 = queries[i][i1];
                if (i1 == 0) {
                    num2 = num1;
                }
            }
            if (num1==num2) {
                count[i] = arr[num1];
            } else if (num1 == num2 + 1) {
                count[i] = arr[num1] ^ arr[num2];
            } else if (arr[num2] < arr[num1] || num1 != num2 + 1) {
                int num3 = 0;
                for (int j = num2; j <= num1; j++) {
                    num3 = num3 ^ arr[j];
                }
                count[i] = num3;
            }
        }
        return count;
    }
}
