package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return String.valueOf(serializeArray(root));
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.replace("[", "");
        data = data.replace("]", "");
        String[] split = data.split(",");
        if (split.length == 1 && split[0].trim().equals("")) {
            return null;
        } else {
            split = data.split(",");
        }

        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }

        return deserializeArray(split);
    }

    private static final TreeNode EMPTY_NODE = new TreeNode(0);
    static {
        EMPTY_NODE.right = EMPTY_NODE;
        EMPTY_NODE.left = EMPTY_NODE;
    };

    private List<Integer> serializeArray(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int validateCount = 1; // 非空节点

        while (validateCount > 0) {
            int size = queue.size();
            validateCount = 0;
            Queue<Integer> levelQueue = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll == null) poll = EMPTY_NODE;

                queue.add(poll.left);
                queue.add(poll.right);
                if (poll != EMPTY_NODE) {
                    validateCount++;
                    levelQueue.add(poll.val);
                } else {
                    levelQueue.add(null);
                }
            }
            if (validateCount > 0) {
                result.addAll(levelQueue);
            }
        }

        return result;
    }

    private TreeNode deserializeArray(String[] data) {
        int len = data.length;
        String[] tree = new String[len + 1];
        System.arraycopy(data, 0, tree, 1, len);
        len++;
        TreeNode[] treeNodes = new TreeNode[len];

        int levelCount = 1;
        int i = 1;
        while (i < len) {
            for (int j = 0; j < levelCount && i + j < len; j++, i++) {
                String str = tree[i];

                TreeNode node = null;
                if (!str.equals("null")) {
                    node = new TreeNode(Integer.valueOf(str));
                }
                treeNodes[i] = node;

                int parentI = i / 2;
                if (parentI > 0) {
                    TreeNode parentNode = treeNodes[parentI];
                    if (parentNode != null) {
                        boolean left = i % 2 == 0;
                        if (left) parentNode.left = node;
                        else parentNode.right = node;
                    }
                }
            }
            levelCount *= 2;
        }

        return treeNodes[1];
    }
}
