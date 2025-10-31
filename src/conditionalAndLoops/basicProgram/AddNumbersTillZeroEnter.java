package conditionalAndLoops.basicProgram;

import java.util.Scanner;

public class AddNumbersTillZeroEnter {

    static void main() {
        Scanner scan = new Scanner(System.in);

        int n;
        int sum=0;
        while (true)
        {
            System.out.println("Enter the integer number");
            n = scan.nextInt();
            if(n==0) {
                break;
            }
            sum=sum+n;
        }
        System.out.println(sum);

    }
}
