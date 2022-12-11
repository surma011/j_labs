/*Напишите программу, в которой создается и инициализируется двумерный числовой массив.
Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.*/

import java.util.Random;

public class task6 {
    public static void main(String[] args){
        Random num = new Random();
        int l=num.nextInt(10+1);
        int[][] array=new int [l][];
        for(int i=0;i<l;i++)array[i]= new int [l];
        for(int i_ext=0;i_ext<l;i_ext++)
        {
            for (int i_int=0;i_int<l;i_int++) {
                array[i_ext][i_int]=num.nextInt(9+1);
                System.out.print(array[i_ext][i_int]+" ");
            }
            System.out.print("\n");
        }
        int del_l=num.nextInt(l+0),del_c=num.nextInt(l+0);
        System.out.println("\nDeleted line = "+ del_l+"\nDeleted column = "+del_c);
        int[][] ed_array=new int [l-1][];
        for(int i=0;i<(l-1);i++)ed_array[i]= new int [l-1];
        for(int i_ext=0;i_ext<(l-1);i_ext++)
        {
            for (int i_int=0;i_int<(l-1);i_int++) {
                if(i_ext>=del_l)
                {
                    if(i_int>=del_c)ed_array[i_ext][i_int]=array[i_ext+1][i_int+1];
                        else ed_array[i_ext][i_int]=array[i_ext+1][i_int];
                }
                else
                {
                    if(i_int>=del_c)ed_array[i_ext][i_int]=array[i_ext][i_int+1];
                        else ed_array[i_ext][i_int]=array[i_ext][i_int];
                }
                System.out.print(ed_array[i_ext][i_int]+" ");
            }
            System.out.print("\n");
        }
    }
}
