package day01_06;

public class Operators01 {
    public static void main(String[] args) {
        //Create three integer variables, name them as a, b, and c
        //Print the result of (a + b*c) % (a+c)

        int a= 5;
        int b= 4;
    int c= 6;
        System.out.println((a + b*c) % (a+c));  // (5+24) % 11 = 29 % 11= 7
    }
}
