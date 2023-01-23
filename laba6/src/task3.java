/*Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное количество
целочисленных аргументов (или целочисленный массив). Методы, на основании переданных аргументов или массива, позволяют
вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.*/

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int com=0;
        do {
            System.out.println("Choose an action\n" +
                    "1 - Enter array\n" +
                    "2 - Show array\n" +
                    "3 - Minimum element\n"+
                    "4 - Maximum element\n"+
                    "5 - Average value\n"+
                    "0 - Exit");
            do{
                System.out.print("Enter com:");
                com = in.nextInt();
                switch (com){
                    case(0):break;
                    case(1):array_storage.enter_array();break;
                    case(2):array_storage.show_array();break;
                    case(3):array_analysis.min_element(array_storage.get_array());break;
                    case(4):array_analysis.max_element(array_storage.get_array());break;
                    case(5):array_analysis.average_value(array_storage.get_array());break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>2)||(com<0));
        }
        while(com!=0);
    }
}
class array_analysis
{
    public static void min_element(int[] array)
    {
        if(array!=null)
        {
            int min=array[0];
            for(int i=1;i<array.length;i++)if(min>array[i])min=array[i];
            System.out.println("Minimum element = "+min);
        }
        else System.out.println("Array is empty.");
    }
    public static void max_element(int[] array)
    {
        if(array!=null)
        {
            int max=array[0];
            for(int i=1;i<array.length;i++)if(max<array[i])max=array[i];
            System.out.println("Maximum element = "+max);
        }
        else System.out.println("Array is empty.");
    }
    public static void average_value(int[] array)
    {
        if(array!=null)
        {
            int array_sum=0;
            for(int i=0;i<array.length;i++)array_sum+=array[i];
            System.out.println("Average value = "+(array_sum/array.length));
        }
        else System.out.println("Array is empty.");
    }
}
class array_storage
{
    private static int[] array;
    public static void enter_array()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements with 'Enter', end - 0(ex. 12 35 78 68 0)");
        int element_count=0,enter_element;
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
    }
    public static void show_array()
    {
        if(array!=null)
        {
            System.out.print("Array field = [");
            for(int i=0;i< array.length;i++)System.out.print(array[i]+",");
            System.out.println("\b]");
        }
        else System.out.println("Array is empty.");
    }
    public static int[] get_array(){return array;}
}