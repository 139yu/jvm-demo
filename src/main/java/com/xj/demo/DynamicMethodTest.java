package com.xj.demo;

import java.util.function.Function;

public class DynamicMethodTest {
    public static void main(String[] args) {

        Function func = (a) -> {
            if (a instanceof String){
                return a.toString();
            }
            if (a instanceof Integer){
                return (Integer) a + 5;
            }
            return null;
        };

        System.out.println(func.apply(5));
    }

}
