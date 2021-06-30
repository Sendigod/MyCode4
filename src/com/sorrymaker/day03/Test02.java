package com.sorrymaker.day03;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."
 * @Author nextGame
 * @Date 2021/5/5 19:43
 * @Version 1.0
 */
public class Test02 {
    @Test
    public void test(){
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
