/*Напишите программу для вычисления суммы двух чисел. Оба числа вводятся пользователем.
Для вычисления суммы используйте оператор +
*/

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int numb_1 = in.nextInt();
        int numb_2 = in.nextInt();
        System.out.println("\nsum = "+(numb_1+numb_2));
    }
}