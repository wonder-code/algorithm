package com.zl.algorithm.sort;

/**
 * 归并排序
 */
public class MergeSort {

    public int[] sort(int[] array){
        return merge(array,0,array.length-1);
    }
    //array:原始数组
    //first:当前数组索引开始值
    //last:当前数组索引结束值
    private int[] merge(int[] array,int first,int last){
        if(first==last){    //数组只有一个元素
            return new int[]{array[first]};     //返回当前元素
        }
        int mid = first+((last-first)>>1);  //获取中间位置索引，拆分数组
        //归
        int[] leftArray = merge(array,first,mid);   //左数组
        int[] rightArray = merge(array,mid+1,last);     //右数组
        //并
        int[] newArray = new int[leftArray.length+rightArray.length];   //左数组与右数组合并成新数组
        int m=0,i=0,j=0;    //m:新数组中放置元素的位置；i:新数组中放置了左数组中元素的个数；j:新数组中放置了右数组中元素的个数
        while(leftArray.length>i && rightArray.length>j){   //左右数组中都有元素未放置在新数组中时
            newArray[m++] = leftArray[i]<rightArray[j]?leftArray[i++]:rightArray[j++];
        }
        while(leftArray.length>i){  //仅有右数组中有元素未放置在新数组中时
            newArray[m++] = leftArray[i++];
        }
        while(rightArray.length>j){ //仅有左数组中有元素未放置在新数组中时
            newArray[m++] = rightArray[j++];
        }

        return newArray;
    }
}
