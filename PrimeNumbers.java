package com.Bridgelabz.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer>primeList=new ArrayList<>();
        int numberOfPrimes=0;
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count<1) {
                primeList.add(i);
                numberOfPrimes++;
            }
        }
        System.out.println("prime Numbers 1 to 1000 are: " +primeList);
        System.out.println("numberof primeNumbers: "+numberOfPrimes);
    }
}
