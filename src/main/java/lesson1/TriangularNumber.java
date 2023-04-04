package lesson1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
import java.util.Scanner;

public class TriangularNumber {
    public static void getTriangularNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; sum <= n; i++) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
