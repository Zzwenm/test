package com.example.object.copy;

import com.example.object.entity.Car;
import com.example.object.entity.Person;

/**
 * 浅拷贝，对于类本身的数据只是进行浅拷贝。
 * 引用是相同的，所以修改clone的对象，原对象的数据也将被修改
 *
 * @author Zzwen
 * @date 2020-8-31 14:26
 */
public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person zhangsan = new Person("张三", 25);
        Car bmw = new Car("宝马");
        zhangsan.setCar(bmw);
        Person lisi = (Person) zhangsan.clone();
        System.out.println(zhangsan);
        System.out.println(lisi);
        System.out.println(zhangsan == lisi);
        System.out.println(zhangsan.getCar() == lisi.getCar());

        System.out.println();
        lisi.getCar().setName("奔驰");
        System.out.println(zhangsan);
        System.out.println(lisi);
    }

}
