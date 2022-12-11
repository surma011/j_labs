/*Напишите программу, в которой создается двумерный массив,
который выводи прямоугольник из цифр 2.*/

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random num = new Random();
        int w=num.nextInt(10+1),h=0;
        do h=num.nextInt(10+1);
        while(w==h);
        int[][] array = new int [h][];
        for(int i=0;i<h;i++)array[i]= new int [w];
        for(int i_ext=0;i_ext<h;i_ext++)
        {
            for(int i_int=0;i_int<w;i_int++)
            {
                array[i_ext][i_int]=2;
                System.out.print(array[i_ext][i_int]+" ");
            }
            System.out.print("\n");
        }
    }
}
