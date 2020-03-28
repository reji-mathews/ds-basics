package com.datastructure.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(60);
        tree.insert(35);
        tree.insert(29);
        tree.insert(65);
        tree.insert(59);
        tree.insert(63);
        tree.insert(67);
        System.out.println("Done insertion");

        System.out.println("In-Order traversal");
        tree.traverseInOrder();

        System.out.println("\n Pre-Order traversal");
        tree.traversePreOrder();

        System.out.println("\nPost-Order traversal");
        tree.traversePostOrder();

    }
}
