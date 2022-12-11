/*Напишите программу, в которой создается двумерный массив,
который выводит прямоугольный треугольник.*/

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random num = new Random();
        int l=num.nextInt(11+1);
        char[][] array = new char [l][];
        for(int i=0;i<l;i++)array[i]= new char [l];
        for(int i_ext=0;i_ext<l;i_ext++)
        {
            for(int i_int=0;i_int<l;i_int++)
            {
                if(i_ext>=i_int)array[i_ext][i_int]='X';
                System.out.print(array[i_ext][i_int]);
            }
            System.out.print("\n");
        }
    }
}
