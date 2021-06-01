package day01_06;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Ask user to enter two integer values. Write a Java Program to swap
        // two numbers by using the third variable.
        // a=12 b=5  ==> a=5 b=12

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c=0;

       c=a;   // c =12
        a=b; // a= 5

        b=c; // b= 12

        System.out.println("a is: "+ a+ " b is : "+ b);




    }
}
