package com.zl.algorithm.sort;

public class RadixSort {
    public int[] sort(int[] array,int n){
        int len = array.length;
        int[][] bucket = new int[10][len];//10个桶,[0,1,2,3,4,5,6,7,8,9]
        int[] count = new int[len];//存储每个桶中元素的个数
        int[] arrayTemp = new int[len];
        int i=1;//当前比较的位数
        while(i<=n){    //从低位比较到高位
            for(int a:array){
                int num = getnum(a,i);//当前位对应的数
                bucket[num][count[num]] = a;//放入桶中
                count[num]++;
            }
            int index=0;
            for(int m=0;m<bucket.length;m++){
                if(count[m]==0){
                    continue;
                }
                for(int k=0;k<count[m];k++){
                    array[index] = bucket[m][k];
                    index++;
                }
            }
            count = new int[len];
            i++;
        }
        return array;
    }

    public int getnum(int num,int n){
        int number = (int) (num/(Math.pow(10,n-1))%10);
        return number;
    }
}
