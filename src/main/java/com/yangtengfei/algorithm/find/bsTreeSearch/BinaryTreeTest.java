package com.yangtengfei.algorithm.find.bsTreeSearch;

public class BinaryTreeTest {

    public static void main(String[] args) {

        BinaryNode<String> binaryNodeH = new BinaryNode<String>("H", null, null);
        BinaryNode<String> binaryNodeI = new BinaryNode<String>("I", null, null);
        BinaryNode<String> binaryNodeD = new BinaryNode<String>("D", binaryNodeH, binaryNodeI);
        BinaryNode<String> binaryNodeE = new BinaryNode<String>("E", null, null);
        BinaryNode<String> binaryNodeB = new BinaryNode<String>("B", binaryNodeD, binaryNodeE);



        BinaryNode<String> binaryNodeF = new BinaryNode<String>("F", null, null);
        BinaryNode<String> binaryNodeG = new BinaryNode<String>("G", null, null);
        BinaryNode<String> binaryNodeC = new BinaryNode<String>("C", binaryNodeF, binaryNodeG);

        BinaryNode<String> binaryNodeRoot = new BinaryNode<String>("A", binaryNodeB, binaryNodeC);

        BinaryTree<String> binaryTree = new BinaryTree<>(binaryNodeRoot);


        //binaryTree.preRoot();
        System.out.println();
        //binaryTree.inRoot();
        //System.out.println(binaryTree);
        //binaryTree.postRoot();

        BinaryNode<String> binaryNode =  binaryTree.findDataByPreRoot("B");
        System.out.println(binaryNode);

        /*BinaryNode<String> binaryNode2 =  binaryTree.findParent("A");
        System.out.println(binaryNode2);*/
    }
}
