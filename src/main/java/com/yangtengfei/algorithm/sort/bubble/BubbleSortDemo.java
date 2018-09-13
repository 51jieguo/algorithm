package com.yangtengfei.algorithm.sort.bubble;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int array[] ={5,4,3,2,1};
        ascSort(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
    }

    public static void ascSort(int array[]){
        boolean exchage = true;
        for(int i=0; i<array.length && exchage; i++){
            exchage = false;
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    exchage = true;
                }
            }
            printArray(array);
        }
    }

    public static void descSort(int array[]){
        boolean exchage = true;
        for(int i=0; i<array.length && exchage; i++){
            exchage = false;
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    exchage = true;
                }
            }
            printArray(array);
        }
    }


    private static void printArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.print("\t" + source[i]);
        }
        System.out.println();
    }
}
