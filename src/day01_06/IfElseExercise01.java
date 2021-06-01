package day01_06;

import java.util.Scanner;

public class IfElseExercise01 {
    public static void main(String[] args) {
        /*
		 Type java code by using if-else statement.
         A shop will give discount of 10% if the cost of purchased quantity
         is more than 1000. Ask user for quantity and unit price then
         judge and print total cost for user.
         If the quantity is less than 1000 output will be “No discount.”
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt();

        System.out.println("Enter the unit price:");
        int unitPrice = scan.nextInt();

        if(quantity>1000){
            System.out.println(unitPrice*0.90*quantity);
        }else{
            System.out.println("No discount.");
        }
scan.close();
    }
}
