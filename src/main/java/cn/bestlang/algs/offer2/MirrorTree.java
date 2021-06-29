package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        mirrorTree(root.left);
        mirrorTree(root.right);

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        return root;
    }
}
