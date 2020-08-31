package com.example.object.hash;

import com.example.object.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Zzwen
 * @date 2020-8-31 15:06
 */
public class HashMain {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        Constructor<? extends Person> constructor = personClass.getConstructor(String.class, Integer.class);
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Person person1 = personClass.newInstance();
        System.out.println(person1);
        Person person2 = new Person();
        System.out.println(Person.class);
        System.out.println(constructor);
    }

}
