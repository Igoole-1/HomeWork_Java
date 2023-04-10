package lesson4;

import java.util.*;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
public class QueueList {
    public static LinkedList<Integer> generateRandomList() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = input.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static List<Integer> enqueue(int num) {
        LinkedList<Integer> arr = generateRandomList();
        arr.addLast(num);
        System.out.println(arr.toString());
        return arr;
    }


    public static int dequeue() {
        LinkedList<Integer> arr = generateRandomList();
        int num = 0;
        num = arr.get(0);
        arr.remove(0);
        System.out.println(arr.toString());
        return num;
    }

    public static int first() {
        LinkedList<Integer> arr = generateRandomList();
        int num = 0;
        num = arr.get(0);
        System.out.println(arr.toString());
        return num;
    }
}
