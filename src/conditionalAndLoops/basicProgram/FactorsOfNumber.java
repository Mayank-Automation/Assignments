package conditionalAndLoops.basicProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumber {

    static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which we need to find factors");
        int n= scan.nextInt();
        ArrayList<Integer> list= new ArrayList<Integer>();
        for (int i=1; i*i<=n; i++ )
        {
            if (n%i==0)
            {
             list.add(i);
             if (i!=n/i)
                {
                    list.add(n/i);
                }
            }
        }
        System.out.println(list);
    }
}
