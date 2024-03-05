package zadachi;

import java.util.Scanner;

//Составить программу, которая в зависимости от порядкового номера дня ме- сяца (1, 2, ..., 12) выводит на экран время года, к которому относится этот месяц.
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number of the month: ");
        int month = scanner.nextInt();
        String season = " ";

        if (month >= 1 && month <= 12){

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }
        } else {
            season = "The number is not correct";
        }

        System.out.println("Этот месяц относится к времени года: " + season);


        scanner.close();

    }
}
