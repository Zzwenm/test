package com.example.object.entity;

import java.util.Objects;

/**
 * @author Zzwen
 * @date 2020-8-31 11:41
 */
public class Person implements Cloneable {

    private String name;

    private Integer age;

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clonePerson = (Person)super.clone();
        clonePerson.car = (Car) car.clone();
        return clonePerson;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
