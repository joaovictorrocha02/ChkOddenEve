import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

         Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Insira um num: ");
        num = in.nextInt();
        if ((num % 2) == 0) {

            System.out.println("O num é par" + num);

        }
        if ((num % 2) != 0) {
            System.out.println("o num é impar  " + num);
        }
        
        
    }
}
