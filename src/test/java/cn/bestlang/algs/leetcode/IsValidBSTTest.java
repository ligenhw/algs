package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsValidBSTTest {

    @Test
    void isValidBST() {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        boolean validBST = new IsValidBST().isValidBST(n1);
        boolean expected = false;
        assertEquals(expected, validBST);
    }
}