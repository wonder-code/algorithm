package com.zl.algorithm.sort;

public class QuickSort {
    public int[] sort(int[] array){
        return change(array,0,array.length-1);
    }


    public int[] change(int[] array,int left,int right){

        int temp = array[left];//取一个基准数
        int l = left;
        int r = right;
        while (l<r){//左指针小于右指针
            while (l<r && array[r]>=temp){//从右边扫描，直到数据小于基准数
                r--;//右指针左移
            }
            if (array[r]<temp){//数据小于基准数时
                array[l] = array[r];//把数据填到左指针指向的位置
            }
            while (l<r && array[l]<=temp){//从左边扫描，直到数据大于基准数
                l++;//左指针右移
            }
            if ((array[l]>temp)){//数据大于基准数时
                array[r] = array[l];//把数据填到右指针指向的位置
            }
        }
        array[l] = temp;//跳出循环时，左右指针重合，将基准数填入。左侧的数都小于基准数，右侧的数都大于基准数。
        if(l-1>left){//若重合位置的前一个不是初始左指针的位置
            array = change(array,left,l-1);//将左侧的数据再次排序
        }
        if(r+1<right){//若重合位置的后一个不是初始右指针的位置
            array = change(array,r+1,right);//将右侧的数据再次排序
        }
        return array;
    }
}
