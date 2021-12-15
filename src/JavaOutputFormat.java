import java.util.Scanner;

public class JavaOutputFormat {

    /**
     * @title: Java Output Formating
     * @desc:
     * 
     *        ## Input Format
     *        >> Every line of input will contain a String followed by an integer.
     *        >> Each String will have a maximun of 10 alphabetic characters.
     *        >> Each integer will be in te inclusive range from 0 to 999.
     * 
     *        ## Output Format
     *        >> In each line of output ther should be two columns:
     *        1. The first column contains the String and is left justified using
     *        exactly 15 characters.
     *        2. The second column contains the integer, expresssed in exactly 3
     *        digits; if the original input has less than three digits, you must pad
     *        your output's leading digits with zeroes.
     * 
     *        ## Sample Input
     *        >> java 100
     *        >> cpp 65
     *        >> python 50
     */

    // Definimos una instancia de la clase Scanner
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese cadena...");
            String s1 = scan.next();
            System.out.println("Ingrese entero...");
            int x = scan.nextInt();
            // Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
