package com.sorrymaker.day01;

import org.junit.Test;

/**
 * 给出一句话，话中单词以空格分隔，求最后一个单词的长度
 * @Author nextGame
 * @Date 2021/5/3 16:27
 * @Version 1.0
 */
public class test01 {
    @Test
    public void test(){
        System.out.println(lengthOfLastWord(" "));
    }
    public int lengthOfLastWord(String s){
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) !=' '){
                count++;
            }else if(s.length()>0){
                return count;
            }
        }
        return count;
    }
}

