package com.bridgelabz.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Regexp {
    static void edit(String s){
                String replaceString=s.replaceAll("name","Naveen");
        System.out.println("rep"+replaceString);
    }

    public static void main(String[] args) {
        String statement="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
        statement=statement.replace("<<name>>","Naveen");
        statement=statement.replace("<<full name>>","Naveen kumar");
        statement=statement.replace("xxxxxxxxxx","7995185400");
        statement=statement.replace("01/01/2016","27/03/2023");
        System.out.println("after: "+statement);
    }


}
