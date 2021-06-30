package com.sorrymaker.day03;

import org.junit.Test;

/**请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。
 * Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。
 * 然后，按原顺序将经解释得到的字符串连接成一个字符串。
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 * @Author nextGame
 * @Date 2021/5/5 20:26
 * @Version 1.0
 */
public class Test04 {
    @Test
    public void test(){
        String command ="G()()(al)()()(al)(al)";
        System.out.println(interpret(command));

    }
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
}
