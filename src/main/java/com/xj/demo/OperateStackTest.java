package com.xj.demo;

public class OperateStackTest {
    public void addAddOperationTest(){
        int i = 10;
        int j = 20;
        int k = i + j;
    }

    public int getSum(){
        int i = 10;
        int j = 20;
        return i + j;
    }

    public void testGetSum(){
        int sum = getSum();
    }

    public void testIncre(){
        int a = 1;
        int b = a++;
        int c = ++a;
    }
}
