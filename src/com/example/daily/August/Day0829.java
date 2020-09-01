package com.example.daily.August;

/**
 * 214. 最短回文串
 *
 * @author Zzwen
 * @date 2020-8-31 17:17
 */
public class Day0829 {

    public static void main(String[] args) {
        String s = shortestPalindrome("aacecaaa");
        System.out.println(s);
    }

    // abecb
    // bcebabecb
    public static String shortestPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder same = new StringBuilder();
        StringBuilder pre = new StringBuilder();
        while (l != r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if(cr!=cl){
                r--;
                if("".equals(pre)){
                    pre.append(cr);
                }else {
                    pre.append(same);
                    pre.append(cr);
                }
            }else {
                l++;
                r--;
                same.append(cl);
            }
        }
        return pre.append(s).toString();
    }

}
