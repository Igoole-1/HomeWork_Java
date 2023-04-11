package lesson6;

import java.util.*;

public class SelectedNotebook {

    public static void NotebookSelection () throws Exception {

        Notebook notebook1 = new Notebook("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        Notebook notebook2 = new Notebook("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Notebook notebook3 = new Notebook("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Notebook notebook4 = new Notebook("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        Notebook notebook5 = new Notebook("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        Notebook notebook6 = notebook1;

        Set<Notebook> unicNotebook = new HashSet<Notebook>();
        unicNotebook.add(notebook1);
        unicNotebook.add(notebook2);
        unicNotebook.add(notebook3);
        unicNotebook.add(notebook4);
        unicNotebook.add(notebook5);
        unicNotebook.add(notebook6);
        System.out.println(notebook1.equals(notebook6));
        System.out.printf("Всего уникальных ноутбуков: %d \n", unicNotebook.size());


        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("объем накопителя: ");
        int storUser = sc.nextInt();

        System.out.println("диагональ");
        double digUser = sc.nextDouble();

        for(Notebook lap: unicNotebook) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();

    }
}
