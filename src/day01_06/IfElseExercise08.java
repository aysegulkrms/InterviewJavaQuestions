package day01_06;

import java.util.Scanner;

public class IfElseExercise08 {
    public static void main(String[] args) {
        /*
		 Type java code by using if-else if() statement.
         A school has following rules for grading system:
         1.Below 50 - D   2.50 to 60 - C   3.60 to 80 - B   4.Above 80 - A
         Ask user to enter marks and print the corresponding grade.
		*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade= scan.nextInt();
        if(grade>80 && grade<=100){
            System.out.println("A");
        }else if(grade>60 && grade<=80){
            System.out.println("B");

        }else if(grade>=50 && grade<=60){
            System.out.println("C");
        }else if(grade<50){
            System.out.println("D");
        }else if(grade>100){
            System.out.println("Grades more than 100 is not valid");
        }else{
            System.out.println("Negative grades are not valid.");
        }

    }
}
