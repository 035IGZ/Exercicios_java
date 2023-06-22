import java.util.Scanner;
import java.util.Locale;

public class Ex4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, hrs;
        double dinphr, salario;

        num = sc.nextInt();
        hrs = sc.nextInt();
        dinphr = sc.nextDouble();

        salario = hrs * dinphr;

        System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", num, salario );

        sc.close();
    }
}