package com.zl.algorithm.sort;

/**
 * 插入排序
 */
public class InsertSort {
    public int[] sort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp = array[i];//未排序中进行比较的数字
            int index = i-1;//已排序中进行比较的下标
            while(index>=0 && array[index]>temp){//比较的下标须大于0且比较的数字须大于未排序中比较的数字
                array[index+1] = array[index];//已排序的数字向后移一位
                index--;//比较的下标向左移
            }
            array[index+1] = temp;//比较的数字小于未排序中比较的数字，将该数字插入后一位（空位）
        }
        return array;
    }
}
