package com.zl.algorithm.sort;

public class HeapSort {
    public int[] sort(int[] array){
        return buildMaxHeap(array,array.length);
    }

    /**
     * 找大顶堆
     * @param array
     * @param size
     * @return
     */
    public int[] buildMaxHeap(int[] array,int size){
        if(size==1){
            return array;
        }
        for(int i=size-1;i>=0;i--){//从堆的底部进行建堆
            array = heap(array,i,size);
        }
        //最大数在堆的顶部
        int temp = array[0];
        array[0] = array[size-1];
        array[size-1] = temp;
        //交换顶部与最底部的值
        array = buildMaxHeap(array,size-1);//去掉最底部的值，对剩下的数组找大顶堆
        return array;
    }

    /**
     * 建堆
     * @param array
     * @param currentIndex，进行比较的节点位置
     * @param size，需排序的数组长度
     * @return
     */
    public int[] heap(int[] array,int currentIndex,int size){
        if(currentIndex>size-1){
            return array;
        }
        int left = 2*currentIndex+1;//该节点的左节点位置
        int right = 2*currentIndex+2;//该节点的右节点位置
        int max = currentIndex;//顶部节点的位置
        if(left<size && array[left]>array[currentIndex]){
            max = left;//若左节点值大于顶部节点，
        }
        if(right<size && array[right]>array[max]){
            max = right;
        }
        if(max!=currentIndex){//左右节点有大于顶部节点的
            int temp = array[currentIndex];
            array[currentIndex] = array[max];
            array[max] = temp;//交换两者位置
            array = heap(array,max,size);//对交换的节点进行建堆
        }
        return array;
    }
}
