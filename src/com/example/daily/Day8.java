package com.example.daily;

/**
 * 110. 平衡二叉树
 * 左右节点的高度绝对值不能超过1
 *
 * @author Zzwen
 * @date 2020-8-17 12:39
 */
public class Day8 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean res = true;

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        getChildHeight(root);
        return res;
    }

    private int getChildHeight(TreeNode node) {
        if (node == null) {
            return 1;
        }
        int left = getChildHeight(node.left) + 1;
        int right = getChildHeight(node.right) + 1;
        if(Math.abs(left-right)>1){
            res = false;
        }
        return left > right ? left : right;
    }

}
