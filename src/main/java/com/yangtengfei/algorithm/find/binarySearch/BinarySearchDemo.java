package com.yangtengfei.algorithm.find.binarySearch;

/**
 * （1）待查找的列表必须有序（通常是从小到大的顺序）。
 * （2）必须使用线性表的顺序存储结构来存储数据（底层用数组实现的）。
 *  时间复杂度是O(logn)，可以看到远远好于顺序查找的O(n)
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        int aim = 9;
        int start = 0;
        int end = array.length-1;
        int restult  = find(aim,start,end,array);
        System.out.println(restult);
    }

    public static int find(int aim,int start, int end ,int []array){
        int mid = (start+end)/2;
        System.out.println("中间元素是:"+array[mid]);
        if(array[mid]==aim){
            return mid;
        }else if(array[mid]<aim){
            System.out.println("向右边查找");
            return find(aim,mid+1,end,array);
        }else if(array[mid]==aim){
            System.out.println("向左边查找");
            return  find(aim,start,mid-1,array);
        }
        return -1;
    }
}
