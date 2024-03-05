package zadachi;
//Число вводится с клавиатуры и выводится в консоль ответ
//Если целое число m делится нацело на целое число n, то вывести на экран ча-стное от деления, в противном случае вывести сообщение "m на n нацело не делится".

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your first number");
            int m = scanner.nextInt();

            System.out.println("Enter your second number");
            int n = scanner.nextInt();

            if (n != 0 & m % n == 0) {
                int result = m / n;
                System.out.println("Result is : " + result);
            } else {
                System.out.println("The first number is not divisible by  the second number");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() );
        }
        finally {
            scanner.close();
        }

    }
}
