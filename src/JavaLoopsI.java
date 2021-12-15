import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaLoopsI {

    /**
     * @title: Java Loops Part I
     * @desc: Use loops to do some simple math.
     * 
     *        ## Task
     *        >> Give an integer, print its first 10 multiples.
     *        >> Each multiple N*i where 1<=i<=10
     * 
     */
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        System.out.println("Ingrese un entero...");
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {

            System.out.println(N + " x " + i + " = " + N * i);

        }

        bufferedReader.close();
    }

}
