package day01_06;

import java.util.Scanner;

public class IfElseExercise04 {
    public static void main(String[] args) {
       /*
		 Type java code by using if statement. When you enter the initial
		 of the day of a week,output should be all possible names of the days.
         For example; if the initial is ’S’ output should be “Saturday or Sunday”
         Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the initial of a day.");
        char initial = scan.next().charAt(0);
        if (initial == 'S') {
            System.out.println("Saturday or Sunday");
        }
        if (initial == 'M') {
            System.out.println("Monday");
        }
        if (initial == 'T') {
            System.out.println("Tuesday or Thursday");
        }if (initial == 'W') {
            System.out.println("Wednesday");
        }
    }
}