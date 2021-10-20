package cn.bestlang.algs.leetcode;

import java.util.HashMap;
import java.util.Map;

class WordDictionary {

    static class Node {
        char val;
        Map<Character, Node> child = new HashMap<>();
        boolean isEnd;

        public Node() {

        }

        public Node(char val) {
            this.val = val;
        }
    }

    private Node root = new Node();

    public WordDictionary() {

    }

    public void addWord(String word) {
        Map<Character, Node> nodes = root.child;
        Node preNode = null;
        for (char c : word.toCharArray()) {
            Node node = nodes.get(c);
            if (node == null) {
                node = new Node(c);
                nodes.put(c, node);
            }
            nodes = node.child;
            preNode = node;
        }
        if (preNode != null) {
            preNode.isEnd = true;
        }
    }

    public boolean search(String word) {
        return search(word, 0, root);
    }

    private boolean search(String word, int index, Node node) {
        if ((node.isEnd || node.child.isEmpty()) && index == word.length()) {
            return true;
        }

        if (node.child.isEmpty() || index == word.length()) {
            return false;
        }

        char c = word.charAt(index);
        boolean match = false;
        if (c == '.') {
            for (Map.Entry<Character, Node> entry : node.child.entrySet()) {
                match = match || search(word, index + 1, entry.getValue());
            }
        } else {
            Node searchNode = node.child.get(c);
            if (searchNode == null) {
                match = false;
            } else {
                match = search(word, index + 1, searchNode);
            }
        }

        return match;
    }
}
