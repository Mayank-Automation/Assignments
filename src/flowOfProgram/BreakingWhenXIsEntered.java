package flowOfProgram;

import java.util.Scanner;

public class BreakingWhenXIsEntered {

    static void main() {
int sum=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");

        while (true)
        {
         String input = scan.nextLine();
         if(input.equalsIgnoreCase("x"))
         {
             break;
         }
         int num= Integer.parseInt(input);
         sum+=num;

        }
        System.out.println("sum of number is "+ sum);

    }
}
