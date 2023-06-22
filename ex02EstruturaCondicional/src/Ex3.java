import java.util.Scanner;
import java.util.Locale;

public class Ex3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, dif;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        dif = (A * B) - (C * D);

        System.out.printf("DIFERENCA = " + dif);

        sc.close();
    }
}