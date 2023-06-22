import java.util.Scanner;
import java.util.Locale;

public class Ex1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt();

        if (x < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}