package com.heatdeath.leetcode.practice.range_601_650;

import com.heatdeath.leetcode.practice.common.TreeNode;

/**
 * Author:  heatdeath
 * Date:    2018/10/19
 * Desc:
 */
public class _617_Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return helper(t1, t2);
    }

    private TreeNode helper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode newNode;
        // 当 t1 或者是 t2 有一者为 null 时，无需继续递归
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            newNode = new TreeNode(t1.val + t2.val);
            newNode.left = helper(t1.left, t2.left);
            newNode.right = helper(t1.right, t2.right);
        }
        return newNode;
    }

//    private TreeNode helper(TreeNode t1, TreeNode t2) {
//        if (t1 == null && t2 == null) {
//            return null;
//        }
//        int temp;
//        TreeNode newNode;
//        if (t1 == null) {
//            temp = t2.val;
//            newNode = new TreeNode(temp);
//            newNode.left = helper(null, t2.left);
//            newNode.right = helper(null, t2.right);
//        } else if (t2 == null) {
//            temp = t1.val;
//            newNode = new TreeNode(temp);
//            newNode.left = helper(t1.left, null);
//            newNode.right = helper(t1.right, null);
//        } else {
//            temp = t1.val + t2.val;
//            newNode = new TreeNode(temp);
//            newNode.left = helper(t1.left, t2.left);
//            newNode.right = helper(t1.right, t2.right);
//        }
//        return newNode;
//    }
}
