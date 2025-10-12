package firstJavaPrograms;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amount");
        int principal = scan.nextInt();

        System.out.println("Enter the rate");
        float rate = scan.nextFloat();
        System.out.println("Enter the time");
        int time = scan.nextInt();
        float ans= interest(principal, rate, time);
        System.out.println(ans);
    }

    static float interest(int p, float r, int t)
    {
        float simpleInterest= (p*r*t) /100;
        return simpleInterest;
    }
}
