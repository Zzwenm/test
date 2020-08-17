package com.example.daily;

/**
 * 43. 字符串相乘
 *
 * @author Zzwen
 * @date 2020-8-13 16:09
 */
public class DayFour {

    public static void main(String[] args) {
        String multiply = multiply("0", "52");
        //156
        //62
        //00246
        //02460
        //24600
//        StringBuilder a = new StringBuilder("000");
//        StringBuilder b = new StringBuilder("000");
//        String multiply = twoSum(a,b).toString();
        System.out.println(multiply);
    }

    private static String multiply(String num1, String num2) {
        if("0".equals(num1)||"0".equals(num2)){
            return "0";
        }
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int shi = 0;
        int ge = 0;
        StringBuilder res = new StringBuilder("0");
        StringBuilder ling = new StringBuilder();
        for (int i = l1; i >= 0; i--) {
            StringBuilder oneRound = new StringBuilder();
            char ci = num1.charAt(i);
            if(i!=l1) {
                ling.append("0");
            }
            for (int j = l2; j >= 0; j--) {
                char cj = num2.charAt(j);
                int mul = Integer.parseInt(String.valueOf(ci)) * Integer.parseInt(String.valueOf(cj));
                ge = (mul + shi) % 10;
                shi = (mul + shi) / 10;
                oneRound.append(ge);
            }
            if (shi != 0) {
                oneRound.append(shi);
            }
            if(!("0".equals(oneRound.toString()))) {
                oneRound = new StringBuilder(ling).append(oneRound);
            }
            shi = 0;
            //相加
            res = twoSum(res.reverse(), oneRound);
        }
        return res.toString();
    }

    // 48 + 79 = 127
    // 84 + 97 = 181
    //6
    //305

    private static StringBuilder twoSum(StringBuilder a, StringBuilder b) {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int shi = 0;
        int ge = 0;
        StringBuilder res = new StringBuilder();
        if(l1<=l2){
            int i = 0;
            while (i<=l1) {
                char ci = a.charAt(i);
                char cj = b.charAt(i);
                int sum = Integer.parseInt(String.valueOf(ci)) + Integer.parseInt(String.valueOf(cj));
                ge = (sum + shi) % 10;
                shi = (sum + shi) / 10;
                res.append(ge);
                i++;
            }
            while (i<=l2){
                int cj = Integer.parseInt(String.valueOf(b.charAt(i)));
                ge = (cj + shi) % 10;
                shi = (cj + shi) / 10;
                res.append(ge);
                i++;
            }
            if(shi!=0){
                res.append(shi);
            }
        }else {
            int i = 0;
            while (i<=l2) {
                char ci = a.charAt(i);
                char cj = b.charAt(i);
                int sum = Integer.parseInt(String.valueOf(ci)) + Integer.parseInt(String.valueOf(cj));
                ge = (sum + shi) % 10;
                shi = (sum + shi) / 10;
                res.append(ge);
                i++;
            }
            while (i<=l1){
                int cj = Integer.parseInt(String.valueOf(a.charAt(i)));
                ge = (cj + shi) % 10;
                shi = (cj + shi) / 10;
                res.append(ge);
                i++;
            }
            if(shi!=0){
                res.append(shi);
            }
        }
        return res.reverse();
    }
}
