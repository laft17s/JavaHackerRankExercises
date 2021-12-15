import java.util.Scanner;

public class ProjectEuler254 {

    /**
     * ## Task
     * >> Define f(n) as the sum of the factorial of the digits of n. For example,
     * f(342) = 3! + 4! + 2! = 32
     * >> Define sf(n) as the sum of the digits of f(n). So sfn(342) = 3 + 2 = 5
     * >> Define g(i) to be the smallest positive integer n susch that sf(n) = i
     * 
     */

    //
    private static final ProjectEuler254 e254 = new ProjectEuler254();
    private static final Scanner scan = new Scanner(System.in);

    // Factorial
    public static int factorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    // Define f(n)
    public int f(int n) {
        int r = 0;
        while (n != 0) {
            // Define an integer a.
            // a = n % 10;
            int a = n % 10;
            // System.out.println("a: " + a);
            //
            r += factorial(a);
            // System.out.println("r: " + r);
            // Divide "n" by 10 until the value of "n" is zero.
            n /= 10;
            // System.out.println("n: " + n);

        }
        return r;
    }

    // Define sf(n)
    public int sf(int n) {
        int r = 0;
        while (n != 0) {

            r += n % 10;
            n /= 10;

        }
        return r;
    }

    // Define g(i)
    public int g(int i) {
        int r = 1;
        int t = 1;
        int sf = 0;

        while (sf != i) {
            int f = e254.f(t);
            sf = e254.sf(f);

            if (sf == i) {
                r = t;
                break;
            }

            t += 1;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Insert value...");
        int x = scan.nextInt();

        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int r = 0;
            for (int i = 1; i <= n; i++) {
                int g = e254.g(i);
                int sg = e254.sf(g);
                r += sg;
            }
            System.out.println(r);
        }

    }
}
