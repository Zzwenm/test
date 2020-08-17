package com.example.sort;

import java.util.Arrays;

/**
 * @author Zzwen
 * @date 2020/7/13 13:56
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        arrayTest(a);
    }

    private static void arrayTest(int[] a){
        System.out.println(Arrays.toString(a));
        System.out.println(a[0] + 3);
    }


}
