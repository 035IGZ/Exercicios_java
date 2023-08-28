package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employe = new Employee();
        System.out.println("Name: ");
        employe.name = sc.nextLine();
        System.out.println("Gross salary: ");
        employe.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employe.Tax = sc.nextDouble();

        System.out.println();
        System.out.println(employe);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employe.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employe);

        sc.close();
    }
}
