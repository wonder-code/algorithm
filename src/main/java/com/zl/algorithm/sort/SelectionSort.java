package com.zl.algorithm.sort;

/**
 * 选择排序
 */
public class SelectionSort {
    public int[] sort(int[] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            int[] tag = new int[]{i,array[i]};
            for(int j=i+1;j<array.length;j++){
                if(tag[1]>array[j]){
                    tag[0] = j;
                    tag[1] = array[j];
                }
            }
            if(tag[0]!=i){
                temp = tag[1];
                array[tag[0]] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
