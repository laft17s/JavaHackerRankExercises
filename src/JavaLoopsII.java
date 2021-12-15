import java.util.Scanner;

public class JavaLoopsII {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Ingrese el número de ciclos...");
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Ingrese a...");
            int a = scan.nextInt();
            System.out.println("Ingrese b...");
            int b = scan.nextInt();
            System.out.println("Ingrese n...");
            int n = scan.nextInt();

            System.out.println("a = " + a + " , " + "n = " + n + " , " + "b = " + b);

            int op = a;

            for (int j = 0; j < n; j++) {
                // System.out.println("op = " + op);
                op += (Math.pow(2, j) * b);
                System.out.print(op + " ");
            }

            System.out.println();

        }
        scan.close();

    }
}
