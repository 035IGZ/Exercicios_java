import java.util.Scanner;
import java.util.Locale;

public class Ex5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, cod1, num2, cod2;
        double vlr1, vlr2, total;

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        vlr1 = sc.nextDouble();

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        vlr2 = sc.nextDouble();

        total = (vlr1 * num1) + (vlr2 * num2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}