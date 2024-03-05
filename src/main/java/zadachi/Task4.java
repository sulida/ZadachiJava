package zadachi;
//Проверить, принадлежит ли число, введенное с клавиатуры, интервалу (–5, 3).
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number between -5 and 3.");
        int number = scanner.nextInt();

        if (number >= -5 && number <= 3) {
            System.out.println("Your number is between -5 and 3.");
        }
        else {
            System.out.println("Your number is not between -5 and 3.");
        }
        scanner.close();

    }

}
