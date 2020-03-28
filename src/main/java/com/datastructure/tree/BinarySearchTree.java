package com.datastructure.tree;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int dataToInsert) {
        if (root == null) {
            root = new TreeNode(dataToInsert);
        }
        else
        {
            root.insert(dataToInsert);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
