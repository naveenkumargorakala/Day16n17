package com.Bridgelabz.Algorithms;

import java.util.Comparator;

public class GenericSort<T > {
    <T> void sorting(T arr[], Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) < 0) {
                    T temp = (arr[i]);
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("arr: "+java.util.Arrays.toString(arr));
    }
    public static void main(String[] args) {
        GenericSort<Integer> arraySort= new GenericSort();
        Integer[] array ={56,20,34,62,23,31,12};
        arraySort.<Integer>sorting(array,Integer::compareTo);
    }

}
