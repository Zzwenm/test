package com.example.domain;

public class A {

    static {
        System.out.println("static A");
    }

    private int a;
    private int b;

    public A(){
        System.out.println("构造A");
    }

    public void sum(int a,int b){
        System.out.println("int int");
    }
    public void sum(int a,long b){
        System.out.println("int long");
    }
    public void sum(double a,long b){
        System.out.println("double long");
    }
    public void sum(double a,int b){
        System.out.println("double int");
    }
    public void sum(float a,long b){
        System.out.println("float long");
    }
}