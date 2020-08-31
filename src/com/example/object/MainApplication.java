package com.example.object;

import com.example.object.entity.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Zzwen
 * @date 2020-8-31 11:41
 */
public class MainApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object object = new Object();
        Person person1 = new Person("张三", 25);
        Person person2 = new Person("张三", 25);
        System.out.println(person1.equals(person2));
        HashSet<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(set.size());
        Map<Person, String> map = new HashMap<>();
        map.put(person1, "1");
        map.put(person2, "2");
        System.out.println(map.size());

        System.out.println();

        Person clonePerson = (Person) person1.clone();
        System.out.println(person1);
        System.out.println(clonePerson);
        System.out.println(person1 == clonePerson);
        System.out.println(person1.equals(clonePerson));
    }
}
