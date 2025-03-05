package cn.bestlang.algs.lc;

import cn.bestlang.algs.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        preOrderTreeRecursion(root, path, result, targetSum);

        return result;
    }

    public void preOrderTreeRecursion(TreeNode node, List<Integer> path, List<List<Integer>> result, int targetSum) {
        if (node == null) {
            return;
        }

        if (isLeafNode(node)) {
            if (node.val == targetSum) {
                path.add(node.val);
                result.add(new ArrayList<>(path));
            }
        } else {
            path.add(node.val);
            int targetSumDelta = targetSum - node.val;
            preOrderTreeRecursion(node.left, new ArrayList<>(path), result, targetSumDelta);
            preOrderTreeRecursion(node.right, new ArrayList<>(path), result, targetSumDelta);
        }
    }

    public static boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
