package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LevelOrderTest {

    @Test
    void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        int[] result = new LevelOrder().levelOrder(root);
        System.out.println(Arrays.toString(result));
    }
}