package com.yangtengfei.algorithm.find.bsTreeSearch;

public class BinaryTree<E> {

    private BinaryNode<E> root;

    public BinaryTree(BinaryNode<E> root) {
        this.root = root;
    }


    public void preRoot(){
        preRoot(root);
    }

    public void inRoot(){
        inRoot(root);
    }

    public void postRoot(){
        postRoot(root);
    }



    public void postRoot(BinaryNode<E> root){
        if(root!=null){
            postRoot(root.left);
            postRoot(root.right);
            System.out.print(root.data);
        }
    }

    public void inRoot(BinaryNode<E> root){
        if(root!=null){
            inRoot(root.left);
            System.out.print(root.data);
            inRoot(root.right);

        }
    }

    public void preRoot(BinaryNode<E> root){
        if(root!=null){
            System.out.print(root.data);
            preRoot(root.left);
            preRoot(root.right);
        }
    }

    public BinaryNode findDataByPreRoot(E data){
       return preRootFind(root,data);
    }

    public BinaryNode preRootFind(BinaryNode<E> root,E data){
        BinaryNode<E> find = null;
        if(root!=null){
            if(root.data.equals(data)){
                return root;
            }else{
                find = preRootFind(root.left,data);
                if (find == null) {
                    find =  preRootFind(root.right,data);
                }
            }
            /*if(root.data.equals(data)){
                return  root;
            }else {

                BinaryNode binaryLeft = preRootFind(root.left,data);
                if(binaryLeft!=null){
                    return binaryLeft;
                }else{
                    BinaryNode binaryRight = preRootFind(root.left,data);
                    if(binaryRight!=null){
                        return binaryRight;
                    }
                }
            }*/
        }
        return find;
    }


    public BinaryNode findParent(E data){
        return findParent(root,data);
    }
    public BinaryNode findParent(BinaryNode<E> root,E data){

        BinaryNode<E> find = null;
        if(root!=null) {
            if(root.data.equals(data)){
                return null;
            }else if(root.left.data.equals(data) || root.right.data.equals(data)){
                return root;
            }else{
                find = findParent(root.left,data);
                if (find == null) {
                    find =  findParent(root.right,data);
                }
            }
        }
        return find;
    }




    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
