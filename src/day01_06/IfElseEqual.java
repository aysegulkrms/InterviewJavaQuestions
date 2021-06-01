package day01_06;

public class IfElseEqual {
    public static void main(String[] args) {
        /*
		 Type java code by using if-else statement,
         if the password is “JavaLearner”, output will be “The password is true”.
         Otherwise, output will be “The password is false”.
		*/
        String password= "JavaLearner";
        if(password.equals("JavaLearner")){
            System.out.println("The password is true");
        }else{
            System.out.println("The password is false");
        }
    }
}
