package com.example.sort;

public class AllSort {

    private AllSort(){}

    //冒泡排序
    public static void BubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    //快排
    public static void quickSort(int[] a){

    }

}
