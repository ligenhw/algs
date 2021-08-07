package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        int nodeVal = preorder[0];
        TreeNode node = new TreeNode(nodeVal);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == nodeVal) {
                index = i;
                break;
            }
        }

        if (index > 0) {
            int[] subPreorder = copy(preorder, 1, 1 + index);
            int[] subInorder = copy(inorder, 0, index);
            node.left = buildTree(subPreorder, subInorder);
        }

        if (index < inorder.length - 1) {
            int[] subPreorder = copy(preorder, index + 1, inorder.length);
            int[] subInorder = copy(inorder, index + 1, inorder.length);
            node.right = buildTree(subPreorder, subInorder);
        }

        return node;
    }

    private int[] copy(int[] src, int start, int end) {
        int[] result = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            result[index++] = src[i];
        }

        return result;
    }
}
