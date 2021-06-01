package day01_06;

public class Operators02 {
    public static void main(String[] args) {
        /*
		 Create two integer variables, name them as a, and b.
		 Calculate the result of a + b * ( a - a % b )
		*/
        int a = 13;
        int b = 6;
        System.out.println(a + b * (a - a % b));   // 13+6*12= 13+72=85
    }
}
