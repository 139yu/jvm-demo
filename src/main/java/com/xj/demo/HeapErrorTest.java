package com.xj.demo;

import java.util.ArrayList;
import java.util.List;

public class HeapErrorTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new Demo());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Demo{
    byte[] bs;
    public Demo(){
        bs = new byte[1024*10];
    }
}
