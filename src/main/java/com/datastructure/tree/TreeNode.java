package com.datastructure.tree;

public class TreeNode {

    private int data;

    private TreeNode leftNode;

    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    ////////////////////// Traversal functions //////////////////////
    public void traverseInOrder() {
        if (leftNode != null) {
            leftNode.traverseInOrder();
        }
        System.out.print(this.data + " ");
        if(rightNode != null)
        {
            rightNode.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(this.data + " ");
        if (leftNode != null) {
            leftNode.traversePreOrder();
        }
        if(rightNode != null)
        {
            rightNode.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (leftNode != null) {
            leftNode.traversePostOrder();
        }
        if(rightNode != null)
        {
            rightNode.traversePostOrder();
        }
        System.out.print(this.data + " ");
    }

    ////////////////////// Insertion into BST //////////////////////
    public void insert(int dataToInsert) {
        if (this.data == dataToInsert) {
            return;
        }

        if (dataToInsert < this.data) {
            if (leftNode == null) {
                leftNode = new TreeNode(dataToInsert);
            }
            else {
                leftNode.insert(dataToInsert);
            }
        } else if (dataToInsert > this.data) {
            if (rightNode == null)
            {
                rightNode = new TreeNode(dataToInsert);
            } else {
                rightNode.insert(dataToInsert);
            }
        }
    }

}
