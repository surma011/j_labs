/*Напишите программу, в которой создается массив и заполняется случайными числами.
Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.*/

import java.util.Random;
import java.util.Scanner;

public class task9 {
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
                array[i]=num.nextInt(10+1);
                System.out.println(i+"\t"+array[i]);
            }
            int min_value=10;
            for(int i=0;i<l;i++)if(min_value>array[i])min_value=array[i];
            System.out.println("\nMinimum elements\nindex\tvalue");
            for(int i=0;i<l;i++)if(min_value==array[i])System.out.println(i+"\t"+array[i]);
        }
        else System.out.println("Incorrect array length");
    }
}
