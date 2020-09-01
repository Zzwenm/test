package com.example.daily.August;

/**
 * 557. 反转字符串中的单词 III
 *
 * @author Zzwen
 * @date 2020-8-31 17:01
 */
public class Day0830 {

    public static void main(String[] args) {
        String str = "Let's go!";
        String s = reverseWords(str);
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ci = s.charAt(i);
            if(ci==' '){
                res.append(word);
                word = new StringBuilder();
                res.append(ci);
                continue;
            }
            word.insert(0,ci);
        }
        res.append(word);
        return res.toString();
    }
}
