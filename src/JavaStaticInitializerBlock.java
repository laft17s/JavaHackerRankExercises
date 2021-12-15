import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static int B = 0;
    private static int H = 0;
    private static boolean flag = true;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}
