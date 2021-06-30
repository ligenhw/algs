package cn.bestlang.algs.offer2;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> nodeMap = new HashMap<>();
        Node node = head;
        Node newPre = new Node(0);
        Node last = newPre;
        while (node != null) {
            Node newNode = new Node(node.val);
            last.next = newNode;
            last = last.next;

            nodeMap.put(node, newNode);
            node = node.next;
        }

        node = head;
        while (node != null) {
            if (node.random != null) {
                nodeMap.get(node).random = nodeMap.get(node.random);
            }
            node = node.next;
        }
        return newPre.next;
    }
}
