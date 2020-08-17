package com.example.test;

public class TestSuper {

    protected int x,y;

    public TestSuper(int x,int y){
        this.x=x;this.y=y;
    }

    public void fun(TestSuper a){
        System.out.println("TestSuper");
    }

}
class superExample extends TestSuper{
    private int z;

    public superExample(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public void fun(TestSuper a){
        System.out.println("superExample");
    }

    public static void main(String[] args) {
        TestSuper a = new superExample(1,2,3);
        superExample b = new superExample(4,5,6);
        a.fun(b);
    }
}

