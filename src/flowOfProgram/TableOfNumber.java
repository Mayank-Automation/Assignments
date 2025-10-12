package flowOfProgram;

import java.util.Scanner;

public class TableOfNumber {

    static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.print(a*i+" ");
        }

    }
}
