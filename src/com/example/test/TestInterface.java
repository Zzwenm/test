package com.example.test;

public interface TestInterface {
    int a = 1;
    static int b = 0;
}
class test implements TestInterface{
    public static void main(String[] args) {
        System.out.println(a);

    }
}
