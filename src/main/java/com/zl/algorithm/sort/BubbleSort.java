package com.zl.algorithm.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public int[] sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int flag=0;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        return array;
    }
}
