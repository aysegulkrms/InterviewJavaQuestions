package day01_06;

import java.util.Scanner;

public class IfelseStatementPositive {
    public static void main(String[] args) {

        //Ask user to enter an integer.
        //If the integer is positive print "Positive" on the console
        //Otherwise print "Not positive" on the console

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int a= scan.nextInt();

        if(a>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative");
        }
        scan.close();
    }
}
