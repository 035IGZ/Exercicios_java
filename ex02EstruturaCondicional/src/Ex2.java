import java.util.Scanner;
import java.util.Locale;

public class Ex2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, result, pi = 3.14159;

        x = sc.nextDouble();

        result = pi * (x * x);

        System.out.printf("A=%.4f%n", result);

        sc.close();
    }
}