package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.TreeNode;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode>[] paths = new LinkedList[2];
        LinkedList<TreeNode> path = new LinkedList<>();
        dfsFirst(path, root, p, q, paths);

        LinkedList<TreeNode> p1 = paths[0];
        LinkedList<TreeNode> p2 = paths[1];
        Iterator<TreeNode> i1 = p1.descendingIterator();
        Iterator<TreeNode> i2 = p2.descendingIterator();
        TreeNode parent = root;
        while (i1.hasNext() && i2.hasNext()) {
            TreeNode n1 = i1.next();
            TreeNode n2 = i2.next();
            if (n1.val == n2.val) {
                parent = n1;
            } else {
                break;
            }
        }

        return parent;
    }

    private void dfsFirst(Deque<TreeNode> path, TreeNode node, TreeNode p, TreeNode q, LinkedList<TreeNode>[] paths) {
        if (node == null) {
            return;
        }

        path.push(node);
        if (node.val == p.val) {
            paths[0] = new LinkedList<>(path);
        } else if (node.val == q.val) {
            paths[1] = new LinkedList<>(path);
        }
        dfsFirst(path, node.left, p, q, paths);
        dfsFirst(path, node.right, p, q, paths);
        path.pop();
    }
}
