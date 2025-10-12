package flowOfProgram;

import java.util.Scanner;

public class LeapYear {
    static void main() {
        boolean isLeap= true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scan.nextInt();

        if(year%4 !=0)
        {
            isLeap=false;
        } else if (year%4 ==0 && year%100==0 && year %400!=0) {
            isLeap=false;
        } else if (year%4 ==0 && year%100!=0) {
            isLeap=true;
        }
        System.out.println(isLeap);
    }
}
