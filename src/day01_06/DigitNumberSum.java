package day01_06;

import java.util.Scanner;

public class DigitNumberSum {
    public static void main(String[] args) {
        /*
		 Ask user to enter a 4 digits integer, then print the sum of the first
         and the last digit of the number on the console.
         For example; if user enters 1234 you will add 1 and 4,
         then print on the console 5
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 4 digits:");
        int a = scan.nextInt();
        int lastDigit= a%10;
        //If you want to get the first digit of a 4 digits number
        //divide the number by 1000. As you see, for 4 digits we are using
        //3 zeros. If the number has 5 digits you need 4 zeros
        int firstDigit= a/1000;
        System.out.println(lastDigit+firstDigit);

    }
}
