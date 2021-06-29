package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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