package day01_06;

import java.util.Scanner;

public class Operators03 {
    public static void main(String[] args) {
        /*
		Ask user to enter two integer values. Write a Java Program to swap
          two numbers by using the third variable.
          a=3, b=5 after swapping a=5, b=3
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers  numbers");
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c=0;
        c=a;   // c= 6
        a=b;   // a= 5
        b=c;   // b= 6
        System.out.println("a is: "+a + " b is: "+ b);

// Second way
        int d= 10;
        int e= 5;

        d= d+e; // 15
        e=d-e;  // 15-5=10;
        d=d-e;   // 15-10= 5
        System.out.println("d is: "+ d +" e is: "+ e);


    }
}
