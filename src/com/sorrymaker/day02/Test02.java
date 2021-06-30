package com.sorrymaker.day02;

import org.junit.Test;

/**
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i位客户在第 j 家银行托管的资产数量。
 * 返回最富有客户所拥有的 资产总量
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 *  输入：accounts = [[1,2,3],[3,2,1]]
 *  输出：6
 *  输入：accounts = [[1,5],[7,3],[3,5]]
 *  输出：10
 *
 * @Author nextGame
 * @Date 2021/5/4 20:04
 * @Version 1.0
 */
public class Test02 {
    @Test
    public void test(){
        int[][] accounts={{1,2,3},{4,5,6},{7,8,9}};
        int i = maximumWealth(accounts);
        System.out.println(i);
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            //只要知道第一组的长度，accounts里的长度都一样，所以是account[0].length
            for (int j = 0; j < accounts[0].length; j++) {
                //加每组里面的每个数
                sum += accounts[i][j];
            }
            //取最大的。
            max = Math.max(max, sum);
        }
        return max;
    }
}
