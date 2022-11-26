/*Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя.
 */

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        System.out.println("");
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
    }
}