package com.yangtengfei.algorithm.sort.bubble;

import java.util.Random;

public class BubbleSort2 {


    public static void sortSort(int array[]){

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        print(array);
    }

    public static void print(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("\t");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(200);
        //System.out.println(new Random().nextInt(10));
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new Random().nextInt(100);
        }
        print(array);

        sortSort(array);

    }

}
