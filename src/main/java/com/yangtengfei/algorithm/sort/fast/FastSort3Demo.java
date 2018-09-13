package com.yangtengfei.algorithm.sort.fast;

public class FastSort3Demo {

    public static void main(String[] args) {
        int a[] = {99,4,3,4,8,7,6,5};
        print(a);
        quickSort(a, 0, a.length - 1);
        print(a);
    }

    static void quickSort(int array[], int begin, int end) {
        //System.out.println("begin:"+begin+"----end:"+end);
        if (begin < end) {
            int i = begin;
            int j = end;
            int x = array[i];
            while (i != j) {
                while (i < j && x <= array[j]) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }

                while (i < j && x >= array[i]) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }
            array[i] = x;
            print(array);

            quickSort(array, begin, i - 1);
            quickSort(array, i + 1, end);
        }
    }

    public static void print(int[] array) {
        System.out.println();
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }

}
