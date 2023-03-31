package com.Bridgelabz.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class permutations {

    static void collectPermutations(String str){
        if(str==null || str.length()==0){
            return ;
        }
        List<String>permutationsList=new ArrayList<>();
        permutationsList.add(String.valueOf(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            for(int j=permutationsList.size()-1;j>=0;j--){
                String s=permutationsList.remove(j);
                for(int k=0;k<=s.length();k++){
                    permutationsList.add(s.substring(0,k)+str.charAt(i)+s.substring(k));
                }
            }
        }
        System.out.println("permutations of "+str+" are: "+permutationsList);
    }
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        String str=input.next();
        collectPermutations(str);
        String str1=input.next();
        collectPermutations(str1);
        //checkEqualStrings(str,str1);

            StringBuilder newstr= new StringBuilder(str);
            if(str.equals(str1)){
                System.out.println("Both are equal");
            }
            else if(str.length()==str1.length()){
                char arr[]= new char[str.length()];
                for(int i=0;i<str.length();i++) {
                    for (int j = 0; j < str1.length(); j++) {
                        char[] string1=str.toCharArray();
                        char[] string2=str1.toCharArray();
                        Arrays.sort(string1);
                        Arrays.sort(string2);
                        Arrays.equals(string1,string2);

                    }
                }
                System.out.println("both the strings have equal charecters");
            }
            else{
                System.out.println("strings are not equal");
            }
        }
    }
