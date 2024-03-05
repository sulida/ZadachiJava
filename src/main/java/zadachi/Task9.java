package zadachi;
//Среди чисел 1, 4, 9, 16, 25, ... найти первое число, большее n.
//        N  вводим с клавиатуры – ответ выводим

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scanner.nextInt();
        int number = 1;

        while (number <= n) {
        System.out.println("Number for comparison is : " + number);

        number = (int)Math.pow(Math.sqrt(number)+ 1, 2);
            }
        System.out.println("The first number greater than " + n + " is : " + number);

        }

    }

