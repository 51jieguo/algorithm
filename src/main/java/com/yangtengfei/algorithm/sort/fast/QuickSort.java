package com.yangtengfei.algorithm.sort.fast;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {5, 8, 6, 4, 6, 7, 9, 2, 4, 1, 3, 6, 5, 7};

        System.out.println("快速排序之前的数组如下：" + Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println("快速排序之后的数组如下：" + Arrays.toString(a));

    }

    public static void quickSort(int arr[], int l, int r) {
        int q;
        if (l < r) {
            /*
             * 得到主元元素的位置下标
             * */
            q = partition(arr, l, r);
            quickSort(arr, l, q - 1);
            quickSort(arr, q + 1, r);

        }

    }

    public static int partition(int[] arr, int l, int r) {
        //选取第一个元素作为主元，也可以选取任意位置的元素作为主元
        int x = arr[l];
        int i = l;
        for (int j = l + 1; j <= r; j++) {
            /*
             * 小于等于主元的数组元素放在主元元素的左边，其他的放在右边
             * */
            if (arr[j] <= x) {
                i++;
                swap(arr, i, j);

            }

        }
        swap(arr, i, l);

        return i;
    }

    public static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;

    }

}