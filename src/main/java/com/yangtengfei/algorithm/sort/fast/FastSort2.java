package com.yangtengfei.algorithm.sort.fast;

import java.util.Random;

public class FastSort2 {

    public static void sortSort(int[] array, int start, int end) {

        if(start<end){
            int i = start;
            int j = end;
            int temp = array[i];
            while (i != j) {
                while (i < j && temp >= array[j]) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }

                while (i < j && temp <= array[i]) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }
            array[i] = temp;
            sortSort(array, start, i - 1);
            sortSort(array, i + 1, end);
        }

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

        sortSort(array, 0, array.length - 1);
        print(array);

    }

}
