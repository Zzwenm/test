package com.example.daily.August;

/**
 * @author Zzwen
 * @date 2020-8-10 21:10
 */
public class DayOne {
    public static void main(String[] args) {
        int countBinarySubstrings = countBinarySubstrings("00110011");
        System.out.println(countBinarySubstrings);
    }
    private static int countBinarySubstrings(String s) {
        int res = 0;
        int pre = 1;
        int count = 0;
        int[] a = new int[s.length()];
        Character lastChar = null;
        for (int i = 0; i < s.length(); i++) {
            if(i==0){
                lastChar = s.charAt(i);
                continue;
            }
            Character ci = s.charAt(i);
            if(ci.equals(lastChar)){
                pre++;
            }else {
                a[count++] = pre;
                pre = 1;
            }
            lastChar = ci;
        }
        a[count++] = pre;
        for (int i = 0; i < count; i++) {
            if(i==a.length-1){
                break;
            }
            res += Math.min(a[i],a[i+1]);
        }
        return res;
    }
}
