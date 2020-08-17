package com.example.cglib;

import com.example.cglib.entity.Person;
import com.example.cglib.entity.Student;
import com.example.cglib.handler.StuHandler;

import java.lang.reflect.Proxy;

/**
 * @author Zzwen
 * @date 2020-8-10 15:13
 */
public class MainApplication {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        StuHandler<Student> studentStuHandler = new StuHandler<>(student);
        Person personProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class},studentStuHandler);
        personProxy.sayHello();
    }

}
