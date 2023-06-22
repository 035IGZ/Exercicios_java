import java.util.Scanner;
import java.util.Locale;

public class Ex7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        }else if (x < 0 && y < 0){
            System.out.println("Q3");
        }else if (x > 0 && y < 0){
            System.out.println("Q4");
        }else {
            System.out.println("No eixo");
        }


        sc.close();
    }
}