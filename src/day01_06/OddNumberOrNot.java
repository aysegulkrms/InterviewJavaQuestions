package day01_06;

import java.util.Scanner;

public class OddNumberOrNot {
    public static void main(String[] args) {
        //Ask user to enter an integer, if the integer is odd
        //then print it on the console, otherwise do not print

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your number:");
        int a = scan.nextInt();
        if(a%2 !=0) {
            System.out.println("The number is odd: " + a);
        }
        scan.close();
    }
}
