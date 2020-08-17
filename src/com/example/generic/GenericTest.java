package com.example.generic;

import com.example.generic.entity.Generic;
import com.example.generic.generator.StringGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zzwen
 * @date 2020-7-21 11:20
 */
public class GenericTest {

    public static void main(String[] args) {
        Generic<Number> numberGeneric = new Generic<>(2.2);
        Generic<Integer> integerGeneric = new Generic<>(154);
        numberGeneric.getData().doubleValue();
        showValue(numberGeneric);
        showValue(integerGeneric);
    }

    private static void showValue(Generic<?> obj){
        System.out.println(obj.getData());
    }

}
