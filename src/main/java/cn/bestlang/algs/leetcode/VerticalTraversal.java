package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class VerticalTraversal {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<TreeNodePoint>> maps = new TreeMap<>();

        traversal(new TreeNodePoint(root, 0, 0), maps);

        for (Map.Entry<Integer, List<TreeNodePoint>> entry : maps.entrySet()) {
            List<TreeNodePoint> value = entry.getValue();
            Collections.sort(value);
            List<Integer> collect = value.stream().map(v -> v.node.val).collect(Collectors.toList());
            result.add(collect);
        }

        return result;
    }

    private void traversal(TreeNodePoint point, Map<Integer, List<TreeNodePoint>> maps) {
        TreeNode node = point.node;
        if (node.left != null) {
            traversal(new TreeNodePoint(node.left, point.x + 1, point.y - 1), maps);
        }

        processNode(maps, point);

        if (node.right != null) {
            traversal(new TreeNodePoint(node.right, point.x + 1, point.y + 1), maps);
        }
    }

    private void processNode(Map<Integer, List<TreeNodePoint>> maps, TreeNodePoint point) {
        int y = point.y;
        if (maps.containsKey(y)) {
            List<TreeNodePoint> treeNodePoints = maps.get(y);
            treeNodePoints.add(point);
        } else {
            List<TreeNodePoint> treeNodePoints = new ArrayList<>();
            treeNodePoints.add(point);
            maps.put(y, treeNodePoints);
        }
    }

    private static class TreeNodePoint implements Comparable<TreeNodePoint>{
        TreeNode node;
        int x;
        int y;

        TreeNodePoint(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(TreeNodePoint o) {
            if (x != o.x) {
                return x - o.x;
            }

            return node.val - o.node.val;
        }
    }
}
