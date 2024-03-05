package zadachi;
//Дано натуральное число. Определить, сколько раз в нем встречается первая цифра.
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter natural number: ");
        int number = scanner.nextInt();

        if(number > 0) {
            String numberString = Integer.toString(number);
            char firstDigit = numberString.charAt(0);
            int count = 0;

            for (int i = 0; i < numberString.length(); i++) {
                if (numberString.charAt(i) == firstDigit) {
                    count++;
                }
            }

            System.out.println("The first digit " + firstDigit + " is met " + count + " times " + "in your number " + number);
        } else
            System.out.println("Your number is not natural");
    }

}
