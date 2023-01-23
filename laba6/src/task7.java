/*Напишите программу со статическим методом, аргументом которому передается символьный массив,
а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива-аргумента.*/


import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        char[] start_array = enter_array();
        int[] end_array = char_array_to_int(start_array);
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

    public static int[] char_array_to_int(char[] enter_array)
    {
        int[] array = new int[enter_array.length];
        for(int i=0;i<array.length;i++)array[i]=(int)enter_array[i];
        return array;
    }
}
