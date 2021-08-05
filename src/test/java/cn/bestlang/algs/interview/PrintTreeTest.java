package cn.bestlang.algs.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTreeTest {

    @Test
    void printTree() {
        PrintTree.Node root = new PrintTree.Node(0);
        root.left = new PrintTree.Node(1);
        root.right = new PrintTree.Node(2);
        root.right.left = new PrintTree.Node(3);

        new PrintTree().printTree(root);
    }
}