import java.util.Scanner;
import java.util.Locale;

public class Ex1While {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int senha = 2002;

        while (x != senha){
            System.out.println("Senha invalida");
            x = sc.nextInt();
        }

        System.out.println("Acesso permitido");
        sc.close();
    }
}