package com.xj.demo;

import java.io.*;

public class ExceptionTableTest {
    public static void main(String[] args) {

    }
    public void handleException(){
        try{
            int a = 1/0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }

    public void readFile() throws IOException {
        File file = new File("G:/githubCode/jvm-demo/assets/类加载过程.png");
        InputStream is = new FileInputStream(file);

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = is.read(buf)) != -1) {
            System.out.println("len:" + len);
        }
    }

    public void read(){
        try {
            readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
