package com.example.daily.August;

/**
 * 657. 机器人能否返回原点
 *
 * @author Zzwen
 * @date 2020-8-28 10:05
 */
public class Day0828 {

    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int mid = moves.length() / 2;
        for (int i = 0; i < moves.length(); i++) {
            char ci = moves.charAt(i);
            if (ci == 'U') {
                x++;
            } else if (ci == 'D') {
                x--;
            } else if (ci == 'L') {
                y--;
            } else {
                y++;
            }
            if (i > mid) {
                if (Math.abs(x) + Math.abs(y) > mid) {
                    return false;
                }
            }
        }
        return x == 0 && y == 0;
    }

    //7. 整数反转
    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if(x<0){
            sb.append("-");
            x = x*-1;
        }
        sb.append(new StringBuilder(String.valueOf(x)).reverse());

        try {
            return Integer.parseInt(sb.toString());
        }catch (NumberFormatException e){
            return 0;
        }

    }

    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        StringBuilder reverse = new StringBuilder(String.valueOf(x));
        reverse.reverse();
        return sb.toString().equals(reverse.toString());
    }
}
