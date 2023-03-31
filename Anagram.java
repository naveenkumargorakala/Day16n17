package com.bridgelabz.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    boolean isAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            for (int i = 0; i < string1.length; i++) {
                if (string1[i] != string2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram object = new Anagram();
        Scanner input = new Scanner(System.in);
        System.out.println("enter string1: ");
        String str1 = input.next();
        System.out.println("enter string2: ");
        String str2 = input.next();
        boolean c = object.isAnagram(str1, str2);
        System.out.println("anagram: " + c);
    }

}

