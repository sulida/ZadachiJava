package zadachi;
//Одна штука некоторого товара стоит 20,4
//        Напечатать таблицу стоимости 2, 3, ..., 20 штук этого товара

public class Task8 {
    public static void main(String[] args) {
        double price = 20.4;

        System.out.println("   Quantity | Total cost");
        System.out.println("-----------------------");

        // Печать таблицы стоимости для количества от 2 до 20 штук
        for (int i = 2; i <= 20; i++) {
            double totalCost = price * i;
            System.out.printf("%11d | %9.2f\n", i, totalCost);
        }

    }
}
