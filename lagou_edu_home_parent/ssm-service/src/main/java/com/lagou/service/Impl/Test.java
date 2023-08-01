package com.lagou.service.Impl;

public class Test {
    public static void main(String[] args) {
        String s1="abcdefg";
        System.out.println(s1.indexOf("efg"));
        String s2 = s1.substring(0,s1.indexOf("efg"));
        System.out.println(s2);
    }
}
