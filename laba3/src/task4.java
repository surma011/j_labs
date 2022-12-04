/*Напишите программу, в которой пользователем вводится два целых числа. Программа выводит все целые числа —
начиная с наименьшего (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел).
Предложите разные версии программы (с использованием разных операторов цикла).
 */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select implementation method[1-for;2-do while]:");
        int method = in.nextInt();
        switch(method){
            case (1):task4_1();break;
            case (2):task4_2();break;
            default:System.out.println("Method not found");break;
        }
    }
    private static void task4_1() {
        System.out.println("Method - for");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = in.nextInt();
        System.out.print("Enter second number:");
        int n2 = in.nextInt();
        int n_current=n1,n_max=n2;
        if(n_current<n_max) for(;n_current<=n_max;n_current++)System.out.print(n_current+" ");
        else
        {
            n_current=n2;
            n_max=n1;
            for(;n_current<=n_max;n_current++)System.out.print(n_current+" ");
        }
    }
    private static void task4_2() {
        System.out.println("Method - do while");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = in.nextInt();
        System.out.print("Enter second number:");
        int n2 = in.nextInt();
        int n_current=n1,n_max=n2;
        if(n_current<n_max)
        {
            do
            {
                System.out.print(n_current+" ");
                n_current++;
            }
            while (n_current<=n_max);
        }
        else
        {
            n_current=n2;
            n_max=n1;
            do
            {
                System.out.print(n_current+" ");
                n_current++;
            }
            while (n_current<=n_max);
        }
    }
}
