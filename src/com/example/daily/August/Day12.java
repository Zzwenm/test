package com.example.daily.August;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 111. 二叉树的最小深度
 *
 * @author Zzwen
 * @date 2020-8-21 9:33
 */
public class Day12 {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        Integer reduce = list.stream().reduce(0, Integer::sum);
//        System.out.println(reduce);
        BigDecimal a = new BigDecimal(15);
        BigDecimal b = new BigDecimal(15);
        BigDecimal c = new BigDecimal(30);
        System.out.println(c.equals(a.add(b)));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l == 0) {
            return r + 1;
        } else if (r == 0) {
            return l + 1;
        }
        return l > r ? r + 1 : l + 1;
    }

    /**
     * 717. 1比特与2比特字符
     *
     * @param bits 比特
     * @return boolean
     */
    public static boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length - 1] != 0) {
            return false;
        }
        for (int i = 0; i < bits.length - 1; i++) {
            if (bits[i] != 0) {
                if (i + 1 >= bits.length - 1) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    private static boolean oneBitCharacter(int[] bits, int start) {
        if (start == bits.length) {
            return true;
        }
        if (bits[start] == 0) {
            return oneBitCharacter(bits, start + 1);
        } else if (bits[start] == 1) {
            if (start + 1 >= bits.length - 1) {
                return false;
            }
            return oneBitCharacter(bits, start + 2);
        }
        return false;
    }

    /**
     * 1023. 驼峰式匹配
     *
     * @param queries
     * @param pattern
     * @return
     */
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>(queries.length);
        for (String query : queries) {
            boolean isCamelMatch = isCamelMatch(query, pattern);
            res.add(isCamelMatch);
        }
        return res;
    }

    private boolean isCamelMatch(String query, String pattern) {
        int q = 0;
        int p = 0;
        int lp = pattern.length();
        while (q < query.length()) {
            if(p>=lp){
                char cq = query.charAt(q);
                if(Character.isUpperCase(cq)){
                    return false;
                }
                q++;
            }
            char cp = pattern.charAt(p);
            char cq = query.charAt(q);
            if (Character.isUpperCase(cq) && Character.isUpperCase(cp)) {
                if (cq == cp) {
                    q++;
                    p++;
                } else {
                    return false;
                }
            } else if (Character.isLowerCase(cq) && Character.isLowerCase(cp)) {
                if (cq == cp) {
                    q++;
                    p++;
                } else {
                    return false;
                }
            } else if (Character.isUpperCase(cp) && Character.isLowerCase(cq)) {
                q++;
            } else {
                return false;
            }
        }
        return true;
    }

}
