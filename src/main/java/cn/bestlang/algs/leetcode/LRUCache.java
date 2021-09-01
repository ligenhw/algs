package cn.bestlang.algs.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    static class Node {
        int key;
        int val;
        Node pre;
        Node next;
    }

    private Map<Integer, Node> cache = new HashMap<>();
    private Node head;
    private Node tail;
    private int size;
    private int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }

        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node == null) {
            node = new Node();
            node.key = key;
            node.val = value;
            addToHead(node);
            cache.put(key, node);
            size++;

            if (size == cap + 1) {
                Node removeNode = removeTail();
                cache.remove(removeNode.key);
                size--;
            }
        } else {
            node.val = value;
            moveToHead(node);
        }
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private Node removeTail() {
        Node removeNode = tail.pre;
        removeNode(removeNode);
        return removeNode;
    }

    private void addToHead(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
}
