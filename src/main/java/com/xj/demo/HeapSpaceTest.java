package com.xj.demo;

/**
 * 虚拟机参数：-Xms10m -Xmx10m -XX:+PrintGCDetails
 */
public class HeapSpaceTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("总内存：" + runtime.totalMemory() / 1024 / 1024 + "M");
        System.out.println("空闲内存：" + runtime.freeMemory() / 1024 / 1024 + "M");
        System.out.println("最大内存：" + runtime.maxMemory() / 1024 / 1024 + "M");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
