package com.example.helloworld;
import java.util.Scanner;
public class Swap {
    public static void main(String args[]){
        System.out.println("enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the value of a = "+a);
        System.out.println("the value of b = "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a after swaping is "+a);
        System.out.println("the value of b after swaping is "+b);

    }
}
