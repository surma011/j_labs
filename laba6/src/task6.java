/*Напишите программу со статическим методом, которому аргументом передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив, который получается из исходного массива (переданного первым
аргументом методу), если в нем взять несколько начальных элементов. Количество элементов, которые нужно взять из
исходного массива, определяются вторым аргументом метода. Если второй аргумент метода больше длины массива, переданного
первым аргументом, то методом создается копия исходного массива и возвращается ссылка на эту копию.*/

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] start_array=enter_array();
        int arg;
        System.out.print("Enter argument:");
        arg = in.nextInt();
        int[] end_array=cut_or_copy(start_array,arg);
        System.out.print("End array = [");
        for(int i=0;i< end_array.length;i++)System.out.print(end_array[i]+",");
        System.out.println("\b]");
    }

    public static int[] enter_array()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements with 'Enter', end - 0(ex. 12 35 78 68 0)");
        int element_count=0,enter_element;
        int[] array = new int[element_count];
        array=null;
        do
        {
            System.out.print(":");
            do
            {
                enter_element = in.nextInt();
                if((enter_element==0)&&(element_count==0))System.out.print("At least one element must be entered...\n:");
            }
            while((enter_element==0)&&(element_count==0));
            if(enter_element!=0)
            {
                if(element_count==0)
                {
                    element_count++;
                    array = new int[element_count];
                    array[element_count-1]=enter_element;
                }
                else
                {
                    int[] temp_array=new int[element_count];
                    System.arraycopy(array,0,temp_array,0,element_count);
                    element_count++;
                    array=null;
                    array = new int[element_count];
                    System.arraycopy(temp_array,0,array,0,(element_count-1));
                    array[element_count-1]=enter_element;
                    temp_array=null;
                }
            }
        }
        while(enter_element!=0);
        return array;
    }

    public static int[] cut_or_copy(int[] enter_array,int arg)
    {
        int[] out_array;
        if(enter_array.length>arg)
        {
            out_array = new int[arg];
            for(int i=0;i<arg;i++)out_array[i]=enter_array[i];
        }
        else
        {
            out_array = new int[enter_array.length];
            System.arraycopy(enter_array,0,out_array,0,enter_array.length);
        }
        return out_array;
    }
}
