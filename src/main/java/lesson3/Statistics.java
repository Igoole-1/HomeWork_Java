package lesson3;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.*;
import java.util.List;

public class Statistics {
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

    public static List<Integer> getValues (){
        IntSummaryStatistics data = new IntSummaryStatistics();
        List<Integer> arr = generateRandomList();
        Iterator<Integer> iter = arr.listIterator();
        while (iter.hasNext()){
            data.accept(iter.next());
        }
        System.out.println("Average: " + data.getAverage());
        System.out.println("Min: " + data.getMin());
        System.out.println("Max: " + data.getMax());
        return arr;
    }
}
