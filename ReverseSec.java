package com.example.helloworld;

import java.util.Scanner;

public class ReverseSec {
    public static void main(String[] args) {
        String reversestr="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        for( int i=str.length()-1;i>=0;i--){
            reversestr = reversestr + str.charAt(i);
        }
        System.out.println("Reverse of given string: " + reversestr);


    }
}
