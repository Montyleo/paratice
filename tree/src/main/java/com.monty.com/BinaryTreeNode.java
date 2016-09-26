package com.monty.com;

/**
 * Created by monty on 16/9/26.
 */
public class BinaryTreeNode<T> {

    T node;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;


    public T getNode() {
        return node;
    }

    public void setNode(T node) {
        this.node = node;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
