package com.example.cglib.entity;

/**
 * @author Zzwen
 * @date 2020-8-10 15:06
 */
public class Student implements Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm a student, " + name);
    }

    public void otherMethod(){
        System.out.println("非接口方法");
    }

}
