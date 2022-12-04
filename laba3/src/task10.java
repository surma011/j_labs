/*Напишите программу, в которой создается целочисленный массив, заполняется случайными числами и после
этого значения элементов в массиве сортируются в порядке убывания значений.*/

import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Еnter the length of the array:");
        int l = in.nextInt();
        if (l > 0) {
            int array[] = new int[l];
            System.out.println("index\tvalue");
            for(int i=0;i<l;i++)
            {
                Random num = new Random();
                array[i]=num.nextInt(100+1);
                System.out.println(i+"\t"+array[i]);
            }
            for(int i_ext=0;i_ext<l;i_ext++)
            {
                int max_value=array[i_ext],max_value_index=i_ext;
                for(int i_int=i_ext;i_int<l;i_int++)if(max_value<array[i_int])
                {
                    max_value=array[i_int];
                    max_value_index=i_int;
                }
                int temp=array[i_ext];
                array[i_ext]=array[max_value_index];
                array[max_value_index]=temp;
            }
            System.out.println("\nSorted arrey\nindex\tvalue");
            for(int i=0;i<l;i++)System.out.println(i+"\t"+array[i]);
        }
        else System.out.println("Incorrect array length");
    }
}
