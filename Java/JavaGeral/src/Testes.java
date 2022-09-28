
import java.util.Scanner;

public class Testes {

    static int b;
    static int h;

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
         b = scan.nextInt();
         h = scan.nextInt();

            try {
                if (b < 0 || h < 0) {
                    throw new Exception("java.lang.Exception: Breadth and height must be positive");
                } else {
                    System.out.println(b*h) ;
                }

            } catch (Exception e) {
                System.out.println(e);
            }


    }

}
