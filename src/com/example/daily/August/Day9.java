package com.example.daily.August;

import java.util.ArrayList;
import java.util.List;

/**
 * 109. 有序链表转换二叉搜索树
 *
 * @author Zzwen
 * @date 2020-8-18 10:10
 */
public class Day9 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // 1 2 3 4 5 6 7 8 9 11 12 13 14 15
    //             7
    //          4     11
    //        2  5   8  13
    //       1   6
    //        5
    //     3    7
    //   2  4  6  8
    //  1          9
    //  0 - 4   len=5

    //  [-10,-3,0,5,9]
    public static void main(String[] args) {
        Integer[] a = new Integer[]{-10,-3,0,5,9};
        TreeNode helper = helper(a, 0, 4);
        System.out.println(helper.val);
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nodeList = new ArrayList<>();
        while (head != null) {
            nodeList.add(head.val);
            head = head.next;
        }
        Integer[] a = new Integer[nodeList.size()];
        nodeList.toArray(a);
        return helper(a, 0, a.length - 1);
    }
    private static TreeNode helper(Integer[] a, int l, int r) {
        if(l>r){
            return null;
        }
        if (l == r) {
            return new TreeNode(a[l]);
        }
        int mid = (r + l) / 2;
        TreeNode midNode = new TreeNode(a[mid]);
        midNode.left = helper(a, l,mid-1);
        midNode.right = helper(a,mid+1,r);
        return midNode;
    }

}
