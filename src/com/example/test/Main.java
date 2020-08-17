package com.example.test;

import com.example.domain.A;
import com.example.domain.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static <T extends Comparable<T>> boolean compare(T a,T b){
        if(a.compareTo(b)>0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println(a);

        /*try {
            int a = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
        }*/

/*

        List<String> data = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            if (!data.contains(s)) {
                data.add(s);
            }
        }

        String result = "";
        for (String s : data) {
            result += s;
        }
        System.out.println(result);
*/



    }
    public static String removeRepeatChar(String s){
        int len = s.length();
        if(len==0)
            return "";
        int i = 0;
        StringBuffer str = new StringBuffer();
        while(i<len){
            char c = s.charAt(i);
            str.append(c);
            i++;
            while(i<len&&s.charAt(i)==c){
                i++;
            }
        }
        return str.toString();
    }
}
