package lesson6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
public class Notebook {
    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public Notebook(String name, int ram, int storageCap, String os, String colour, double diagonal){
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format(" Марка и модель: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n",
                this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            return this.name.equals(((Notebook) obj).name) && this.ram == ((Notebook) obj).ram
                    && this.storageCap == ((Notebook) obj).storageCap && this.os.equals(((Notebook) obj).os)
                    && this.colour.equals(((Notebook) obj).colour) && this.diagonal == ((Notebook) obj).diagonal;
        }
        return false;

    }

    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.storageCap;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }

}
