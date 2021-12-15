import java.util.Scanner;

public class JavaDatatypes {

    /**
     * @title: Java Datatypes
     * @desc:
     * 
     *        ## Datatypes
     *        >> Java has 8 primitive data types:
     *        >> char, boolean, byte, short, int, long, float and double.
     * 
     *        1. A byte is an 8-bit signed integer.
     *        2. A byte is a 16-bit signed integer.
     *        3. A byte is a 32-bit signed integer.
     *        4. A byte is a 64-bit signed integer.
     * 
     *        ## Input Format
     *        >> The first line contains an integer, T, denoting the number of test
     *        cases.
     *        >> Each test case, T, is comprised of a single line with an integer,
     *        n, which can be arbitrarily large or small.
     * 
     * 
     * 
     */

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] argh) {

        System.out.println("Insert the number of test cases...");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                System.out.println("Insert long value...");
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                // Byte
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                // Short
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                // Int
                if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");
                // Long
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
