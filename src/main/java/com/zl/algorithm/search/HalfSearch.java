package com.zl.algorithm.search;

/**
 * 二分查找法
 */
public class HalfSearch {

    public static int halfSearch(int[] sortedArray,int key){
        int min = 0;
        int max = sortedArray.length;
        int mid;
        int index = 0;
        while (true){
            mid = (min+max)>>1;
            if(sortedArray[mid]==key){
               index = mid;
               break;
            }else if(sortedArray[mid]>key){
                max = mid;
            }else{
                min = mid;
            }
        }
        return index+1;
    }


}
