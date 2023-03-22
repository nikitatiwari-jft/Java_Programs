package com.example.helloworld;
import java.util.Scanner;
public class array {

    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        n=sc.nextInt();

        int [] arr=new int[100];
        System.out.println("enter the element of array");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of the element is "+sum);
    }



}
