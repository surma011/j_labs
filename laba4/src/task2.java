/*Напишите программу, которая выводит в консольное окно прямоугольный треугольник.*/

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Еnter leg length:");
        int l = in.nextInt();
        if (l > 0) {
            for(int i_ext=0;i_ext<=l;i_ext++)
            {
                for(int i_int=0;i_int<i_ext;i_int++)
                {
                    if((i_ext==0)|(i_ext==l))System.out.print("X");
                    else if((i_int==0)|(i_int==(i_ext-1)))System.out.print("X");
                    else System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
        else System.out.println("Incorrect array length");
    }
}
