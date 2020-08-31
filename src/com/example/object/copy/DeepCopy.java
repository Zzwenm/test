package com.example.object.copy;

import com.example.object.entity.Car;
import com.example.object.entity.Person;

/**
 * 想要将非基本类型变量也复制成新的对象
 * 需要将非基本类型类也实现Cloneable接口
 * 并在复写clone方法时，将复制的对象再进行一次复制。
 *
 * @author Zzwen
 * @date 2020-8-31 14:21
 */
public class DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person zhangsan = new Person("张三", 25);
        Car bmw = new Car("宝马");
        Person lisi = (Person) zhangsan.clone();
        lisi.setName("李四");
        System.out.println(zhangsan);
        System.out.println(lisi);
    }

}
