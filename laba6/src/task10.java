/*Напишите программу со статическим методом, аргументом которому передается произвольное количество
целочисленных аргументов. Результатом метод возвращает массив из двух элементов: это значения наибольшего
и наименьшего значений среди аргументов, переданных методу.*/


import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        int[] args_array=enter_array();
        int[] end_array=min_max_arg(args_array);
        System.out.print("End array = [");
        for(int i=0;i<end_array.length;i++)System.out.print(end_array[i]+",");
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

    public static int[] min_max_arg(int ... args)
    {
        int[] array = new int[2];
        array[0]=args[0];
        array[1]=args[0];
        for(int i=0;i<args.length;i++)
        {
            if(array[0]>args[i])array[0]=args[i];
            if(array[1]<args[i])array[1]=args[i];
        }
        return array;
    }
}
