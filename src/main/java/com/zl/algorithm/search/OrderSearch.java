package com.zl.algorithm.search;

/**
 * 顺序查找
 */
public class OrderSearch {
    public static int orderSearch(int[] sortedArray,int key){
        int index = 0;
        for(int i=0;i<sortedArray.length;i++){
            if(sortedArray[i]==key){
                index = i;
            }
        }
        return index+1;
    }
}
