package com.example.daily.August;

/**
 * 647. 回文子串
 *
 * @author Zzwen
 * @date 2020-8-19 11:22
 */
public class Day10 {
    public static void main(String[] args) {
        int i = countSubstrings("abc");
        System.out.println(i);
    }

    public static int countSubstrings(String s) {
        int res = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ci = s.charAt(i);
            for (int j = 0; j <= i; j++) {
                char cj = s.charAt(j);
                if (i == j) {
                    dp[i][j] = true;
                    res++;
                } else if (j + 1 == i && ci == cj) {
                    dp[i][j] = true;
                    res++;
                } else {
                    if (ci == cj && dp[i - 1][j + 1]) {
                        dp[i][j] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }

}
