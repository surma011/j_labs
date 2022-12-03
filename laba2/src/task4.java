/*Напишите программу, которая проверяет, попадает ли введение пользователем
число в диапазон от 5 до 10 включительно.
*/

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("5 <= x <= 10");
        System.out.print("at x =  ");
        int x = in.nextInt();
        if((x>=5)&(x<=10))System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
