import java.util.Scanner;
import java.util.Locale;

public class Ex7For {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
        }
        sc.close();
    }
}