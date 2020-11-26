package com.datastructure.tree;

public class InOrder {
    public static void inOrder(TreeNode node) {
        if(node.getLeftNode() !=null) {
            inOrder(node.getLeftNode());
        }
        System.out.print(node.getData()+" ");
        if(node.getRightNode() !=null) {
            inOrder(node.getRightNode());
        }
    }
}
