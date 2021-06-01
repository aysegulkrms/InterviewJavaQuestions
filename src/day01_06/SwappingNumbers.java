package day01_06;

public class SwappingNumbers {
    public static void main(String[] args) {
        // First way
//        int a= 20;
//        int b=30;
//        int temp= a;
//        a=b;
//        b=temp;
//
//        System.out.println("a is:"+ a +" b is:"+ b);

        // Second way
//        int a= 20;
//        int b=30;
//        a+=b-(b=a);    // 20+30-20 = a= 30  b zaten yukarida 20 esitlendi.
//        System.out.println("a is:"+ a +" b is:"+ b);

      //Third way
        int a= 20;
        int b=30;

        a= a+b;   // 20+30= 50
        b=a-b;   //50-30= 20
        a-=b;
        System.out.println("a is:"+ a +" b is:"+ b);
    }
}
