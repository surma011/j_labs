/*Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
В результате вызова метода элементы массива попарно меняются местами: первый — с последним , второй — с
предпоследним и так далее.*/


import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        char[] start_array = enter_array();
        char[] end_array = swap_array(start_array);
        System.out.print("End array = [");
        for(int i=0;i<end_array.length;i++)System.out.print(end_array[i]+",");
        System.out.println("\b]");
    }

    public static char[] enter_array()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements with 'Enter', end - 0(ex. a b c d 0)");
        int element_count=0;
        char enter_element;
        char[] array = new char[element_count];
        array=null;
        do
        {
            System.out.print(":");
            do
            {
                enter_element = in.next().charAt(0);
                if((enter_element=='0')&&(element_count==0))System.out.print("At least one element must be entered...\n:");
            }
            while((enter_element=='0')&&(element_count==0));
            if(enter_element!='0')
            {
                if(element_count==0)
                {
                    element_count++;
                    array = new char[element_count];
                    array[element_count-1]=enter_element;
                }
                else
                {
                    char[] temp_array=new char[element_count];
                    System.arraycopy(array,0,temp_array,0,element_count);
                    element_count++;
                    array=null;
                    array = new char[element_count];
                    System.arraycopy(temp_array,0,array,0,(element_count-1));
                    array[element_count-1]=enter_element;
                    temp_array=null;
                }
            }
        }
        while(enter_element!='0');
        return array;
    }

    public static char[] swap_array(char[] enter_array)
    {
        char[] array = new char[enter_array.length];
        for(int i=0;i<(array.length/2);i++)
        {
            array[i]=enter_array[enter_array.length-1-i];
            array[array.length-1-i]=enter_array[i];
        }
        if(array.length%2!=0)array[array.length/2]=enter_array[enter_array.length/2];
        return array;
    }
}
