package com.xj.demo;

public class ClassInit {
    private static int i = 1;
    static {
        i = 2;
        j = 3;
    }
    private static int j = 311;
    public static void main(String[] args) {
        String a = "";
        new ClassInit();
        System.out.println(j);
    }

    public ClassInit() {
        int a = 1;
    }
}
