/*Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
число делится на 4,
и при этом оно не меньше 10.*/


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int numb = in.nextInt();
        boolean condition_1=false,condition_2=false;
        if(numb%4==0)
        {
            System.out.println("\nRemainder after dividing by 4 = "+(numb%4)+"\nCondition met\n");
            condition_1 = true;
        }
        else System.out.println("\nRemainder after dividing by 5 = "+(numb%4)+"\nCondition not met\n");
        if(numb>=10)
        {
            System.out.println("The number "+numb+" is not less than 10\nCondition met\n");
            condition_2 = true;
        }
        else System.out.println("The number "+numb+" is less than 10\nCondition not met\n");
        if((condition_1==true)&(condition_2==true))System.out.println("The number "+numb+" satisfies all conditions.");
        if(condition_1!=condition_2)System.out.println("The number "+numb+" does not satisfy one of the conditions");
        if((condition_1==false)&(condition_2==false))System.out.println("The number "+numb+" does not satisfy any of the conditions");
    }
}
