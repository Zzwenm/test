package com.example.daily.August;

/**
 * @author Zzwen
 * @date 2020-8-24 9:20
 */
public class Day15 {

    public static void main(String[] args) {
        String str = "abca";
        String pre = str.substring(0,str.length()/2);
        String las = str.substring(str.length()/2);
        System.out.println(str.indexOf("a",0));
    }

    // abc abc abc abc

    /**
     * 由重复的子字符串组成
     * 分支，判断左右是否相等
     *
     * @param s 字符串
     * @return 是否
     */
    public boolean repeatedSubstringPattern(String s) {
        return false;
    }

    //abcabcabc
    //abca bcabc
    private boolean isRepeatedSubstringPattern(String str) {
        int len = str.length();
        int mid = len / 2;
        if(len%2==1){
            return true;
        }
        String preStr = str.substring(0, mid);
        String lasStr = str.substring(mid);
        if(!preStr.equals(lasStr)){
            return false;
        }
        boolean pre = repeatedSubstringPattern(preStr);
        boolean las = repeatedSubstringPattern(lasStr);
        return pre && las;
    }

}
