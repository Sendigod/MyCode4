package com.sorrymaker.day16;

import java.util.Stack;

/**
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * 注意，您的结果中 不应 包含任何括号。
 * @Author nextGame
 * @Date 2021/5/26 21:07
 * @Version 1.0
 */
public class Test01 {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '(') {
                stack.push(i);
            }

            if (arr[i] == ')') {
                reverse(arr, stack.pop() + 1, i - 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ')' && arr[i] != '(') {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }

    public void reverse(char[] arr, int left, int right) {

        while (right > left) {

            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            right--;
            left++;
        }
    }
}
