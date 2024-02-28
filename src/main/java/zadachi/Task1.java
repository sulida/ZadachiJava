package zadachi;
//В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному при этом двузначному числу слева приписали вторую цифру числа x, то полу- чилось число 546. Найти число x.
//Написать код  и вывести ответ в консоль
public class Task1 {

        public static void main(String[] args) {

            int createdNumber = 546;


            int x = createdNumber / 100;
            int y = (createdNumber / 10) % 10;
            int z = createdNumber % 10;


            System.out.println("Число x: " + y + x + z);
        }
    }

