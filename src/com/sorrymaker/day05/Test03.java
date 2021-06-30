package com.sorrymaker.day05;

import org.junit.Test;

/**统计位数为偶数的数字
 * @Author nextGame
 * @Date 2021/5/7 18:40
 * @Version 1.0
 */
public class Test03 {
    @Test
    public void test(){
        int[] nums ={555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]>=10&&nums[i]<100)||(nums[i]>=1000&&nums[i]<10000)||(nums[i]==1000000)){
                count++;
            }
        }
        return count;
    }
}
