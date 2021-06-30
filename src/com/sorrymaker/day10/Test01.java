package com.sorrymaker.day10;

/**
 * @Author nextGame
 * @Date 2021/5/13 21:27
 * @Version 1.0
 */
public class Test01 {
    public int game(int[] guess, int[] answer) {
        int count=0;
        for (int i = 0; i < guess.length; i++) {
            if(guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }
}
