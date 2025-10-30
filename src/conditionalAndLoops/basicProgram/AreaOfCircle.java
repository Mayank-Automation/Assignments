package conditionalAndLoops.basicProgram;

import java.util.Scanner;

public class AreaOfCircle {

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r = scan.nextFloat();
        scan.close();
        System.out.println(areaOfCircle(r));
    }
        static float areaOfCircle(float radius)
        {
        double area = 3.14 * radius*radius;
        return (float) area;
    }
}
