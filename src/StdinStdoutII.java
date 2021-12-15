import java.util.Scanner;

public class StdinStdoutII {

    /**
     * @title: Stdin & Stdout Part Two
     * @desc: Read an integer, a double and a String from Stdin, then print the
     *        values according to the instructions.
     * 
     *        ## Input Format
     *        >> There ar 3 lines of input:
     *        1. The first line contains an integer
     *        2. The second line contains a double
     *        3. The third line contains a String
     * 
     *        ## Output Format
     *        >> There ar 3 lines of output:
     *        1. The first line prints the value of the String
     *        2. The second line prints the value of the double
     *        3. The third line prints the value of the int
     */

    // Definimos una instancia de la clase Scanner
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Declaramos y asignamos las variables tipo int, double y String
        System.out.println("Ingresa un entero...");
        int i = scan.nextInt();
        System.out.println("Ingresa un decimal...");
        double d = scan.nextDouble();
        System.out.println("Ingresa una cadena...");
        // De esta manera lee los espacios entre palabras
        scan.nextLine();
        String s = scan.nextLine();

        // Cerramos la entrada por teclado
        scan.close();

        // Imprimir los valores
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }

}
