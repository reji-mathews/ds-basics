package com.datastructure.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(35);
        binarySearchTree.insert(29);
        binarySearchTree.insert(65);
        binarySearchTree.insert(59);
        binarySearchTree.insert(63);
        binarySearchTree.insert(67);
        System.out.println("Done insertion");

        System.out.println("In-Order traversal");
        InOrder.inOrder(binarySearchTree.getRoot());
        /*binarySearchTree.traverseInOrder();

        System.out.println("\n Pre-Order traversal");
        binarySearchTree.traversePreOrder();

        System.out.println("\nPost-Order traversal");
        binarySearchTree.traversePostOrder();*/

    }
}
