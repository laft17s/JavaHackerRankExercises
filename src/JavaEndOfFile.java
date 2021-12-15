import java.util.Scanner;

public class JavaEndOfFile {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        int n = 1;
        while (scan.hasNext()) {
            String s = scan.nextLine();
            System.out.println(n + " " + s);
            n++;
        }

    }
}
