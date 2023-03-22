package com.example.helloworld;

import java.util.Scanner;

public class MissingEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        arr[3] = 0;
        System.out.println(sum);
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum2);
        int missingvalue = 0;
        missingvalue = sum - sum2;
        System.out.println("the missing value in the array is " + missingvalue);
    }
}
