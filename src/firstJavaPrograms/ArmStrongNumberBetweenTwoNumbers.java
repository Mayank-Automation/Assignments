package firstJavaPrograms;

import java.util.Scanner;

public class ArmStrongNumberBetweenTwoNumbers {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = scan.nextInt();
        System.out.println("Enter the second number");
        int second = scan.nextInt();

        for (int i=first; i<=second; i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i);
            }
        }

    }

    static boolean isArmstrong(int n)
    {
        int sum=0;
        int temp= n;
            while (temp>0) {

                int r = temp % 10;
                sum = sum + (r * r * r);
                temp = temp / 10;
            }
             return sum==n;
    }

    }
