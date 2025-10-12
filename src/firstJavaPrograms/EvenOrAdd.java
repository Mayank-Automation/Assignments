package firstJavaPrograms;

import java.util.Scanner;

public class EvenOrAdd {

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num= scan.nextInt();
        evenOdd(num);
    }

    static void evenOdd(int n)
    {
//        if (n==0)
//        {
//            System.out.println("Number is zero");
//        }
        if( n%2==0)
        {
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
