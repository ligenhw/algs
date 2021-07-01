package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeToDoublyListTest {

    @Test
    void treeToDoublyList() {
        TreeToDoublyList.Node node = new TreeToDoublyList.Node(1);
        TreeToDoublyList.Node node2 = new TreeToDoublyList.Node(2);
        TreeToDoublyList.Node node3 = new TreeToDoublyList.Node(3);
        node.left = node2;
        node.right = node3;
        TreeToDoublyList.Node doublyList = new TreeToDoublyList().treeToDoublyList(node);
        System.out.println(doublyList);
    }
}