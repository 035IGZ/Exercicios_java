import java.util.Scanner;
import java.util.Locale;

public class Ex4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        int resultado;

        if (x < y){
            resultado = (y - x);
        }else{
            resultado = 24 - y - x;
        }

        System.out.println("O JOGO DUROU " + resultado + " HORA(S)");

        sc.close();
    }
}