package com.yangtengfei.algorithm.sort.fast;

public class FastSort2Demo {

    public static void main(String[] args) {

        int array[] = {3,4,8,7,6,5};

        int start = 0;
        int end = array.length - 1;
        print(array);
        sort(array, start, end);

    }

    public static void sort(int[] array, int begin, int end) {
        if (end - begin < 1) {
            return;
        }
        int x = array[begin];
        int p1 = begin;
        int p2 = end;
        boolean direction = true;


        L1:
        while (p1 < p2) {
            if (direction) {
                for (int i = p2; i > p1; i--) {
                    if (array[i] <= x) {
                        array[p1++] = array[i];
                        p2 = i;
                        direction = !direction;
                        System.out.println("从右到左p2=======>" + p2);
                        print(array);
                        continue L1;
                    }
                }
                p2 = p1;
            } else {
                for (int i = p1; i < p2; i++) {
                    if (array[i] >= x) {
                        array[p2--] = array[i];
                        p1 = i;
                        direction = !direction;
                        System.out.println("从左到右p1=====》" + p1);
                        print(array);
                        continue L1;
                    }
                }
                p1 = p2;
            }
        }
        array[p1] = x;
        print(array);
        sort(array, begin, p1-1);
        sort(array, p1 + 1, end);
    }

    public static void print(int[] array) {

        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
