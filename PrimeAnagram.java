package com.Bridgelabz.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimeAnagram {
    List<Integer> primeList = new ArrayList<>();

    public void primes() {

        int numberOfPrimes = 0;
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 1) {
                primeList.add(i);
                numberOfPrimes++;
            }
        }
        System.out.println("primes are: " + primeList);
    }

//    public void array() {
//        // convert integer list to string list
//        List<String> newPrimeList = primeList.stream().map(String::valueOf).collect(Collectors.toList());
//
//        for (int i = 0; i < newPrimeList.size(); i++) {
//            int c = 0;
//            for (int j = i + 1; j < newPrimeList.size(); j++) {
//                boolean obj = object1.isAnagram(newPrimeList.get(i), newPrimeList.get(j));
//                if (obj == true) {
//                    System.out.println("i: " + newPrimeList.get(i));
//                    System.out.println("i: " + newPrimeList.get(j));
//                }
//            }
//        }
//    }

    public void palindrome(int n) {
        int copyOfn = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = 10 * sum + rem;
            n = n / 10;
        }
        if (sum == copyOfn) {
            System.out.println("Prime&palindrome: " + copyOfn);
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        PrimeAnagram prime = new PrimeAnagram();
        prime.primes();
      //  prime.array();
        for (int i = 0; i < prime.primeList.size(); i++) {
            prime.palindrome(prime.primeList.get(i));
        }
    }
}
