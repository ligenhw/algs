package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll == null) {
                sb.append("null,");
            } else {
                sb.append(poll.val).append(",");
                queue.add(poll.left);
                queue.add(poll.right);
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.replace("[", "");
        data = data.replace("]", "");
        String[] split = data.split(",");
        if (split.length == 1 && split[0].equals("")) {
            return null;
        }

        return deserializeArray(split);
    }

    private TreeNode deserializeArray(String[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(data[0]));
        queue.add(root);
        int i = 1;

        while (queue.size() > 0) {
            TreeNode poll = queue.poll();

            String left = data[i++];
            if (!left.equals("null")) {
                poll.left = new TreeNode(Integer.valueOf(left));
                queue.add(poll.left);
            }

            String right = data[i++];
            if (!right.equals("null")) {
                poll.right = new TreeNode(Integer.valueOf(right));
                queue.add(poll.right);
            }
        }

        return root;
    }
}
