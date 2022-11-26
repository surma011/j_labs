/*Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его возраст.
*/

import java.util.Date;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your year of birth: ");
        int year_of_birth = in.nextInt();
        int current_year = Integer.parseInt(String.format("%tY",new Date()));
        if(current_year>=year_of_birth)
        {
            System.out.println("\nYour name: "+name);
            if(current_year==year_of_birth)System.out.println("Your age: 0");
            else System.out.println("Your age: "+(current_year-year_of_birth-1)+"-"+(current_year-year_of_birth));
        }
        else System.out.println(name+", you too young.");
    }
}