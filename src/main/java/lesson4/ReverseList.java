package lesson4;
//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
import java.util.*;

public class ReverseList {
    public static List<Integer> generateRandomList() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = input.nextInt();
        Random random = new Random();LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }
    public static LinkedList<Integer> getReverseList () {
        //IntSummaryStatistics data = new IntSummaryStatistics();
        LinkedList<Integer> list = (LinkedList<Integer>) generateRandomList();
        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.set(i,list.get(list.size() - i - 1));
            list.set(list.size() - i - 1,temp);
        }
        System.out.println(list.toString());
        return list;
    }
}