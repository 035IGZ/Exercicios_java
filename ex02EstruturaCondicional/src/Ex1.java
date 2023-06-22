import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        int soma = x + y;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}