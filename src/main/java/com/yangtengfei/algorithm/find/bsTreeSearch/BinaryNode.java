package com.yangtengfei.algorithm.find.bsTreeSearch;

public class BinaryNode<E> {



    public E data;

    public BinaryNode<E> left;

    public BinaryNode<E> right;

    public BinaryNode(E data, BinaryNode<E> left, BinaryNode<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
