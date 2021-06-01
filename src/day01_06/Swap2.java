package day01_06;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int a= scan.nextInt();
        int b= scan.nextInt();

        a= a+b;   // 17
        b= a-b;   // 12-5= 7
        a=a-b;   // 12-7=5

        System.out.println("After swapping: " + a + " and " + b);
    }
}
