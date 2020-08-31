package com.example.daily.August;

import sun.reflect.generics.tree.Tree;

/**
 * 700. 二叉搜索树中的搜索
 *
 * @author Zzwen
 * @date 2020-8-12 18:58
 */
public class DayThreeAnother2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        return getTree(root, val);
    }

    private TreeNode getTree(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return getTree(root.right, val);
        } else {
            return getTree(root.left, val);
        }
    }

}
