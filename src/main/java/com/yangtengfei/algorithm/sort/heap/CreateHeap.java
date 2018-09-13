package com.yangtengfei.algorithm.sort.heap;

import java.io.Serializable;
import java.util.Arrays;

public class CreateHeap {

    public static void main(String[] args) {
        String array[] = new String[10];
        for(int i=0; i<10; i++){
            array[i] = ""+i;
        }
        E<String> e= setData(0,array);
        System.out.println(e.left);
        System.out.println(e.right);
    }

    static E<String> setData(int index,String[] array){
        E<String> e = new E<>();
        if(index<=array.length-1){
            e.setData(array[index]);
            e.setLeft(setData(index*2+1,array));
            e.setRight(setData(index*2+2,array));
            return e;
        }else{
            return null;
        }
    }
}

class E<T> implements Serializable{
    E left;
    E right;
    T data;

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" + left +
                "," + right +
                "," + data +
                '}';
    }
}
