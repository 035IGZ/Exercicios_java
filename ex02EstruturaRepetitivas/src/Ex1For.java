import java.util.Scanner;
import java.util.Locale;

public class Ex1For {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}