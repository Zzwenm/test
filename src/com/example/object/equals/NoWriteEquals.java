package com.example.object.equals;

/**
 * 不写equals方法，只是对引用是否相等进行判断
 *
 * @author Zzwen
 * @date 2020-8-31 14:59
 */
public class NoWriteEquals {

    static class Student {
        private String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("张三");
        Student student2 = new Student("张三");
        System.out.println(student1.equals(student2));
    }

}
