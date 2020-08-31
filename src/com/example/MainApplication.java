package com.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        List<?>[] list = new ArrayList<?>[10];
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        list[0] = stringList;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        list[1] = integerList;
        for (int i = 0; i < 2; i++) {
            System.out.println(list[i]);
        }
    }
}
