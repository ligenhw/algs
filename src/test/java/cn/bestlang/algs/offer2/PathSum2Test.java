package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathSum2Test {

    @Test
    void pathSum() {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(8);
        root.left = left;
        root.right = right;

        List<List<Integer>> lists = new PathSum2().pathSum(root, 9);
        System.out.println(lists);
    }
}