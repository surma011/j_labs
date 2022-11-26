/*Напишите программу, в которой Пользователь вводит два числа,
а программой вычисляется и отображается сумма и разность этих чисел.
 */

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int numb_1 = in.nextInt();
        int numb_2 = in.nextInt();
        System.out.println("\nsum = "+(numb_1+numb_2));
        if(numb_2>numb_1)System.out.println("\ndifference = "+(numb_2-numb_1));
        else System.out.println("\ndifference = "+(numb_1-numb_2));
    }
}