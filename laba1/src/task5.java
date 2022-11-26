/*Напишите программу, в которой по году рождения определяется возраст пользователя.*/


import java.util.Date;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int current_year = Integer.parseInt(String.format("%tY",new Date()));
        System.out.println("Enter your year of birth");
        int year_of_birth = in.nextInt();
        if(current_year>=year_of_birth)
        {
            if(current_year==year_of_birth) System.out.println("You are a baby. You are 0 years old!");
            else System.out.println("You are between "+(current_year-year_of_birth-1)+" and "+(current_year-year_of_birth)+" years old.");
        }
        else System.out.println("You too young.");
    }
}