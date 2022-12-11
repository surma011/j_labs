/*Напишите программу, в которой создается двумерный целочисленный массив.
Он заполняется случайными числами. Затем в этом массиве строи и столбцы меняются местами:
первая строка становится первым столбцом, вторая строка становиться вторым столбцом и
так далее. Например, если исходный массив состоял из 3 строк и 5 столбцов,
то в итоге получаем массив из 5 строк и 3 столбцов.*/

import java.util.Random;

public class task5 {
    public static void main(String[] args){
        Random num = new Random();
        int w=num.nextInt(10+1),h=0;
        do h=num.nextInt(10+1);
        while(w==h);
        System.out.println("Source array");
        int[][] array=new int [h][];
        for(int i=0;i<h;i++)array[i]= new int [w];
        for(int i_ext=0;i_ext<h;i_ext++)
        {
            for (int i_int=0;i_int<w;i_int++) {
                array[i_ext][i_int]=num.nextInt(9+1);
                System.out.print(array[i_ext][i_int]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("inverted array");
        int[][] inv_array=new int [w][];
        for(int i=0;i<w;i++)inv_array[i]= new int [h];
        for(int i_ext=0;i_ext<w;i_ext++) {
            for (int i_int=0;i_int<h;i_int++) {
                inv_array[i_ext][i_int]=array[i_int][i_ext];
                System.out.print(inv_array[i_ext][i_int]+" ");
            }
            System.out.print("\n");
        }
    }
}
