package com.zl.algorithm.sort;

public class ShellSort {
    public int[] sort1(int[] array) {
        int len = array.length;
        int step = (len-1)/2;
        for(int i=step;i>0;i/=2){

        }
        return array;
    }

    public int[] sort(int[] array){
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] > temp) { //需要注意的是，这里array[j] > temp将会使数组从小到到排序。
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
        return array;
    }

}
