package com.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * list test
 *
 * @author Zzwen
 * @date 2020/6/25 8:46
 */
public class listTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
//
//        System.out.println("列表中最大的数 : " + stats.getMax());
//        System.out.println("列表中最小的数 : " + stats.getMin());
//        System.out.println("所有数之和 : " + stats.getSum());
//        System.out.println("平均数 : " + stats.getAverage());
        List<Integer> list = new ArrayList<>(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
        list.addAll(numbers);
        System.out.println(list);

    }

    private static Stream<?> flatMapFun(String i) {
        return null;
    }

    /**
     * 判断字符串是否是数字
     *
     * @param str 字符串
     * @return 是否是数字
     */
    private static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ci = str.charAt(i);
            if (!Character.isDigit(ci)) {
                return false;
            }
        }
        return true;
    }
}
