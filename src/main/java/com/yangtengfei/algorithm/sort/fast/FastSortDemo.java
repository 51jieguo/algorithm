package com.yangtengfei.algorithm.sort.fast;

public class FastSortDemo {

    public static void main(String[] args) {
        int[] array = {6, 5, 7,8, 3, 2, 1};
        int start = 0;
        int end = array.length - 1;
        sort(array, start, end);
        print(array);
    }

    public static void sort(int table[], int low, int high) {
        //System.out.println("high==================="+high);
        if (low < high) {
            int i = low;
            int j = high;
            int vot = table[low];
            while (i != j) {
                while (i < j && vot <= table[j]) {
                    j--;
                }
                if (i < j) {
                    table[i] = table[j];
                    print(table);
                    i++;
                }
                while (i < j && vot > table[i]) {
                    i++;
                }
                if (i < j)  {
                    table[j] = table[i];
                    print(table);
                    j--;
                }

            }
            table[i] = vot;

            print(table);
            //System.out.println("jjjjjjjjjjjjjjjjjjj============"+j);
            //sort(table, low, j - 1);

            //System.out.println("xxxxxxxxxxxxxx============"+i);
            //sort(table, i + 1, high);
        }
    }
    static void print(int []array){
        System.out.println();
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
