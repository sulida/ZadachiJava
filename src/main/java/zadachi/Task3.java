package zadachi;
//Число вводится с клавиатуры и выводится в консоль ответ
//        Дано двузначное число. Определить:
//        а) какая из его цифр больше: первая или вторая;
//        б) одинаковы ли его цифры.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your two-digit number");

        int number = scanner.nextInt();
        if (number >= 10 && number <= 99) {
            int firstDigit = number /10;
            int secondDigit = number % 10;
            if (firstDigit > secondDigit) {
                System.out.println("The first digit is greater than the second digit.");
            }
            else if (secondDigit > firstDigit) {
                System.out.println("The second digit is greater than the first digit.");
            } else {
                System.out.println("The digits are equal.");
            }

        } else {
            System.out.println("You have entered not two-digital number.");
        }

    }
}
