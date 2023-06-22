import java.util.Scanner;
import java.util.Locale;

public class Ex5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, quantidade;

        cod = sc.nextInt();
        quantidade = sc.nextInt();

        double valor;

        if (cod == 1){
            valor = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (cod == 2){
            valor =quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (cod == 3){
            valor =quantidade * 5.00;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (cod == 4){
            valor =quantidade * 2.00;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (cod == 5){
            valor =quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", valor);
        }

        sc.close();
    }
}