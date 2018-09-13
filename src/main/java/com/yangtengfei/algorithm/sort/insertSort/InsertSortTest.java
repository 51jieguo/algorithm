package com.yangtengfei.algorithm.sort.insertSort;

public class InsertSortTest {
    public static void InsertSort(int[] source) {
        int i, j;
        int insertNode;// 要插入的数据
        // 从数组的第二个元素开始循环将数组中的元素插入
        for (i = 1; i < source.length; i++) {
            // 设置数组中的第2个元素为第一次循环要插入的数据
            insertNode = source[i];
            j = i - 1;
            // 如果要插入的元素小于第j个元素，就将第j个元素向后移
            while ((j >= 0) && insertNode < source[j]) {
                source[j + 1] = source[j];
                j--;
            }
            // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
            source[j + 1] = insertNode;
            System.out.print("第" + i + "趟排序：");
            printArray(source);
        }
    }

    private static void printArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.print("\t" + source[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int source[] = new int[]{53, 38, 36, 15, 69, 42};
        System.out.print("初始关键字：");
        printArray(source);
        System.out.println("");
        InsertSort(source);

        System.out.print("\n\n排序后结果：");
        printArray(source);
    }

} 