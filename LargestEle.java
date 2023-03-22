package com.example.helloworld;
import java.util.Scanner;
public class LargestEle {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
    n= sc.nextInt();
    int[] arr=new int[100];
    System.out.println("enter the element of the array");
    for(int i=0;i<n;i++)
    {
        arr[i]= sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int thirdMax = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        int element = arr[i];

        if (element > max) {
            thirdMax = secondMax;
            secondMax = max;
            max = element;
        }
        else if (element > secondMax && element < max)
        {
            thirdMax = secondMax;
            secondMax = element;
        }
        else if (element > thirdMax && element < secondMax)
        {
            thirdMax = element;
        }
    }

    System.out.println("The third largest element is: " + thirdMax);
}
}