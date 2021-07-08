package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

import java.util.*;

public class PathSum2 {
    /**
     * 二叉树先序遍历 求和
     * 通过 stack 保存路径
     *
     * @param root
     * @param target
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> pathList = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        dfs(root, target, 0, stack, pathList);

        return pathList;
    }

    public void dfs(TreeNode node, int target, int sum, Deque<TreeNode> stack, List<List<Integer>> pathList) {
        if (node == null) {
            return;
        }

        boolean leaf = node.left == null && node.right == null;
        if (leaf && node.val + sum == target) {
            addToPaths(stack, pathList);
        }

        stack.push(node.left);
        dfs(node.left, target, sum + node.val, stack, pathList);
        stack.pop();

        stack.push(node.right);
        dfs(node.right, target, sum + node.val, stack, pathList);
        stack.pop();
    }

    private void addToPaths(Deque<TreeNode> stack, List<List<Integer>> pathList) {
        List<Integer> path = new ArrayList<>();
        Iterator<TreeNode> iterator = stack.descendingIterator();
        while (iterator.hasNext()) {
            path.add(iterator.next().val);
        }

        pathList.add(path);
    }

}
