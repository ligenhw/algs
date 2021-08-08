package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxPathSumTest {

    @Test
    void maxPathSum() {
        TreeNode n1 = new TreeNode(-10);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        int expected = 42;
        assertEquals(expected, new MaxPathSum().maxPathSum(n1));
    }

    @Test
    void maxPathSum2() {
        TreeNode n1 = new TreeNode(-2);
        TreeNode n2 = new TreeNode(-3);

        n1.right = n2;

        int expected = -2;
        assertEquals(expected, new MaxPathSum().maxPathSum(n1));
    }

    @Test
    void maxPathSum3() {
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(-3);
        TreeNode n4 = new TreeNode(-6);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(2);
        TreeNode n7 = new TreeNode(-6);
        TreeNode n8 = new TreeNode(-6);
        TreeNode n9 = new TreeNode(-6);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        n5.left = n6;
        n6.left = n7;
        n6.right = n8;
        n7.left = n9;

        int expected = 16;
        assertEquals(expected, new MaxPathSum().maxPathSum(n1));
    }
}