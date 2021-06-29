package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

public class IsSubStructure {


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        return isSameStructure(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSameStructure(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        } else if (a == null) {
            return false;
        }

        return a.val == b.val && isSameStructure(a.left, b.left)
                && isSameStructure(a.right, b.right);

    }
}
