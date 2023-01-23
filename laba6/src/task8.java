/*Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
а результатом возвращается среднее значение для элементов массива (сумма значений элементов, деленная
на количество элементов в массиве).*/


import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int[] array = enter_array();
        System.out.println("Average value of array - "+average_of_array(array));
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
    public static int average_of_array(int[] enter_array)
    {
        int average_value=0;
        for(int i=0;i<enter_array.length;i++)average_value+=enter_array[i];
        average_value/=enter_array.length;
        return average_value;
    }
}


