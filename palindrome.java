package com.example.helloworld;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        int i,sum=0,r,temp;

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
            temp=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

}
