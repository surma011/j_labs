/*Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
при делении на 5 в остатке получается 2,
а при делении на 7 в остатке получается 1.
*/

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int numb = in.nextInt();
        boolean condition_1=false,condition_2=false;
        if(numb%5==2)
        {
            System.out.println("\nRemainder after dividing by 5 = "+(numb%5)+"\nCondition met\n");
            condition_1 = true;
        }
        else System.out.println("\nRemainder after dividing by 5 = "+(numb%5)+"\nCondition not met\n");
        if(numb%7==1)
        {
            System.out.println("Remainder after dividing by 7 = "+(numb%7)+"\nCondition met\n");
            condition_2 = true;
        }
        else System.out.println("Remainder after dividing by 7 = "+(numb%7)+"\nCondition not met\n");
        if((condition_1==true)&(condition_2==true))System.out.println("The number "+numb+" satisfies all conditions.");
        if(condition_1!=condition_2)System.out.println("The number "+numb+" does not satisfy one of the conditions");
        if((condition_1==false)&(condition_2==false))System.out.println("The number "+numb+" does not satisfy any of the conditions");
    }

}
