/*Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3
*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int numb = in.nextInt();
        if(numb%3==0) System.out.println("Remainder = "+(numb%3)+"\nNumber divisible by 3");
        else System.out.println("Remainder = "+(numb%3)+"\nNumber is not divisible by 3");
    }
}