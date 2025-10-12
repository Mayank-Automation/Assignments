package firstJavaPrograms;

public class FibonacciSeries {

    static void main() {
        int n=10;
      //  0 1 1 2 3 5 8 13 21
        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0; i<n-2; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
