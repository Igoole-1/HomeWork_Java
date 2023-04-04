package lesson1;
//Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class ProductNumber {
    public static void getProductNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 1;
        for (int i = 1; sum <= n; i++) {
            sum = sum * n;
        }
        System.out.println(sum);
    }
}