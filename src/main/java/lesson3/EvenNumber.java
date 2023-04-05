package lesson3;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class EvenNumber {
    public static List<Integer> generateRandomList() {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static List<Integer> removeEvenNumber(List<Integer>list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(list.toString());
        return list;
    }
}
