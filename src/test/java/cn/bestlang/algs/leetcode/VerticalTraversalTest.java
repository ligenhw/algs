package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class VerticalTraversalTest {

    @Test
    void verticalTraversal() {
        Map<Integer, Integer> maps = new TreeMap<>();
        maps.put(1, 1);
        maps.put(-1, 2);

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    void verticalTraversal2() {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        node1.left = node2;
        node1.right = node3;

        List<List<Integer>> lists = new VerticalTraversal().verticalTraversal(node1);
        System.out.println(lists);
    }
}