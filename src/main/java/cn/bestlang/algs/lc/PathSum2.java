package cn.bestlang.algs.lc;

import cn.bestlang.algs.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

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

        path.add(node.val);
        if (isLeafNode(node)) {
            if (node.val == targetSum) {
                result.add(new ArrayList<>(path));
            }
        } else {
            int targetSumDelta = targetSum - node.val;
            preOrderTreeRecursion(node.left, path, result, targetSumDelta);
            preOrderTreeRecursion(node.right, path, result, targetSumDelta);
        }
        path.removeLast();
    }

    public static boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
