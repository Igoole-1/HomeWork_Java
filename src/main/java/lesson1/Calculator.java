package lesson1;
//Реализовать простой калькулятор
import java.util.Scanner;

public class Calculator {
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Выберите действие: 1 - сумма; 2 - вычитание; 3 - деление; 4 - умножение : ");
        Scanner var = new Scanner(System.in);
        double result = 0;
        int choice = var.nextInt();
        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Результат " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Результат " + result);
                break;
            case 3:
                result = a / b;
                System.out.println("Результат " + result);
                break;
            case 4:
                result = a * b;
                System.out.println("Результат" + result);
                break;
        }
    }
}
