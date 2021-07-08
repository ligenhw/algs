package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
