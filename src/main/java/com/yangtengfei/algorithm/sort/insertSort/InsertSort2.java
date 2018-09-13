package com.yangtengfei.algorithm.sort.insertSort;

import java.util.Random;

public class InsertSort2 {

    public static void sortSort(int array[]) {

        int n = array.length;
        int temp;
        int j;
        for (int i = 1; i < n; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
            print(array);
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

        sortSort(array);


    }
}
