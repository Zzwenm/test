package com.example.daily.August;

/**
 * @author Zzwen
 * @date 2020-8-12 19:19
 */
public class DayThreeAnother3 {

    public static void main(String[] args) {
        String decodeString = decodeString("e1[f]ef");
        System.out.println(decodeString);
    }

    public static String decodeString(String s) {
        return getDecodeString(s, 0);
    }

    private static String getDecodeString(String s, int start) {
        StringBuilder res = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for (int i = start; i < s.length(); i++) {
            char ci = s.charAt(i);
            if(ci<='9'&&ci>='0'){
                num.append(ci);
            }else if(ci=='['){
                String decodeString = string(s, i + 1);
                for (int j = 0; j < Integer.valueOf(num.toString())-1; j++) {
                    res.append(decodeString);
                }
                num = new StringBuilder();
            }else if(ci!=']'){
                res.append(ci);
            }
        }
        return res.toString();
    }

    private static String string(String s, int start) {
        StringBuilder code = new StringBuilder();
        for (int i = start; i < s.length(); i++) {
            char ci = s.charAt(i);
            if(ci<='9'&&ci>='0'){
                String decodeString = getDecodeString(s, i);
                code.append(decodeString);
                return code.toString();
            }else if(ci == ']'){
                return code.toString();
            }else if(ci!='[') {
                code.append(ci);
            }
        }
        return null;
    }

}
