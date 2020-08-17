package com.example.test;

public class TestRewrite {
    public static void main(String[] args) {
        A a = new A(1);
        A aa = new A(1);
        B b = new B(2);
        C c = new C(4);
        D d = new D(5);

        /*a.show(a);
        a.show(b);
        b.show(c);
        b.show(d);

        A ba = new B();
        ba.show(c);
        ba.show(d);*/
        //System.out.println(a==aa);

        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


    }
}
class A {
    public int a;
    public A(int a){
        this.a=a;
    }
    public void show(A obj) {
        System.out.println("A.show(A)");
    }

    public void show(C obj) {
        System.out.println("A.show(C)");
    }
}

class B extends A {

    public B(int a) {
        super(a);
    }

    @Override
    public void show(A obj) {
        System.out.println("B.show(A)");
    }
}

class C extends B {
    public C(int a) {
        super(a);
    }
}

class D extends C {
    public D(int a) {
        super(a);
    }
}