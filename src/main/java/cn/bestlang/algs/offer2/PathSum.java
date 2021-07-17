package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> recur = recur(root, target);
        if (recur == null) {
            recur = new ArrayList<>();
        }

        return recur;
    }

    private List<List<Integer>> recur(TreeNode node, int target) {
        if (node.left == null && node.right == null) {
            if (node.val == target) {
                List<List<Integer>> result = new ArrayList<>();
                LinkedList<Integer> list = new LinkedList<>();
                list.addFirst(node.val);
                result.add(list);
                return result;
            } else {
                return null;
            }
        }

        int delta = target - node.val;
        boolean flag = false;
        List<List<Integer>> union = new ArrayList<>();
        if (node.left != null) {
            List<List<Integer>> leftR = recur(node.left, delta);
            if (leftR != null) {
                appendVal(leftR, node.val);
                flag = true;
                union.addAll(leftR);
            }
        }
        if (node.right != null) {
            List<List<Integer>> rightR = recur(node.right, delta);
            if (rightR != null) {
                appendVal(rightR, node.val);
                flag = true;
                union.addAll(rightR);
            }
        }

        return flag ? union : null;
    }

    private void appendVal(List<List<Integer>> result, int val) {
        for (List<Integer> list : result) {
            LinkedList<Integer> linkedList = (LinkedList<Integer>) list;
            linkedList.addFirst(val);
        }
    }

}
