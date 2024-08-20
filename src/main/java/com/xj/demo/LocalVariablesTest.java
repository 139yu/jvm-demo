package com.xj.demo;

public class LocalVariablesTest {
    public static void main(String[] args) {
        int num = 10;
    }

    public void test(){
        long l = 10L;
        int num = 20;
        {
            int a = 1;
            a = num + 1;
        }
        int c = num + 1;
    }
}
