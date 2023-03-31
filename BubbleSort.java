package com.Bridgelabz.Algorithms;

import java.util.Arrays;

public class BubbleSort {
    void sorting(int []arr){
        int sortedarray[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
             int a=arr[i];
            sortedarray[i]=a;
            System.out.println(i+"arr[i]: "+arr[i]);
        }
        System.out.println("sorted items are: "+ Arrays.toString(sortedarray));
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort= new BubbleSort();
        int array[]={20,34,56,12,8,30,23};
        bubbleSort.sorting(array);
    }
}
