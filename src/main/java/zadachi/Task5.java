package zadachi;
//Определить, является ли треугольник со сторонами a, b, c равнобедренным.
//        Возможно ввести стороны треугольника и получить ответ
//        Число вводится с клавиатуры и выводится в консоль ответ

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first side length of the triangle");
        int a = scanner.nextInt();

        System.out.println("Enter the second side length of the triangle");
        int b = scanner.nextInt();

        System.out.println("Enter the third side length of the triangle");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if (a == b && a == c && b == c) {
                System.out.println("The triangle is equilateralisosceles");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is isosceles");
            } else
                System.out.println("The triangle is not isosceles");

        } else
            System.out.println("You have entered wrong numbers");

        scanner.close();

    }
}
