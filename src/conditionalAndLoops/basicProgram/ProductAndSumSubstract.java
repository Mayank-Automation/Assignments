package conditionalAndLoops.basicProgram;

import java.util.Scanner;

public class ProductAndSumSubstract {

    // we are getting the difference of product and sum of digits of int

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        int sum=0;
        int product = 1;
        int temp=number;
        int difference;
        while (number>0)
        {
            int r = number%10;
            sum= sum+r;
            product= product*r;
            number=number/10;
        }
        if (product>sum) {
            difference = product - sum;
        }else {
            difference= sum-product;
        }
        System.out.println("The difference is "+ difference);
    }
}
