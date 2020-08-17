package com.example.test;

public class Test {
    public static void main(String[] args){
        Test test1 = new Test(1,1,1);
        Test test2 = new Test();
        System.out.println(test2);


    }
    private int y,z;
    static int x;
    public Test(){}
    public Test(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void showObject(){
            System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test that = (Test) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }
    @Override
    public Test clone() throws CloneNotSupportedException {
        return (Test)super.clone();
    }
}
