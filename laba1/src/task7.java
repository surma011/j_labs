/* Напишите программу, в которой по возрасту определяется год рождения*/

import java.util.Date;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        int current_year = Integer.parseInt(String.format("%tY",new Date()));
        if((age>=0)&(age<current_year))
        {
            if(age==0)System.out.println("Your year of birth: "+current_year);
            else System.out.println("Your year of birth "+(current_year-age-1)+" or "+(current_year-age));
        }
        else
        {
            if(age<0)System.out.println("Your too young.");
            else System.out.println("Your too old, time to rest");
        }
    }
}