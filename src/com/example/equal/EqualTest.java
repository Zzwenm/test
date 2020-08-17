package com.example.equal;

import com.example.equal.pojo.Student;

/**
 * @author Zzwen
 * @date 2020-7-24 16:54
 */
public class EqualTest {

    public static void main(String[] args) {
        Student a = new Student();
        a.setName("zhangsan");
        Student b = new Student();
        b.setName("zhangsan");
        System.out.println(a.equals(b));

        String x = "123123";
        String y = "123123";
        System.out.println(x==(y));

    }

}
