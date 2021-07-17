package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.TreeNode;

public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder. length - 1);
    }

    private TreeNode buildTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe) {
            return null;
        }

        int val = preorder[ps];
        int mid = findNode(inorder, is, ie, val);
        int leftSize = mid - is;
        TreeNode node = new TreeNode(val);
        node.left = buildTree(preorder, ps + 1, ps + leftSize, inorder, is, mid - 1);
        node.right = buildTree(preorder, ps + leftSize + 1, pe, inorder, mid + 1, ie);

        return node;
    }

    private int findNode(int[] inorder, int is, int ie, int k) {
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == k) {
                return i;
            }
        }

        return -1;
    }
}
