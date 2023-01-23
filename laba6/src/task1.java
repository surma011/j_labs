/*Напишите программу с классом, в котором есть два поля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений полям.
Если метод вызывается с символьным аргументом, то соответствующее значение
присваивается символьному полю. Если метод вызывается с текстовым аргументом,
то он определяет значение текстового поля. Методу аргументом также может передаваться
символьный массив. Если массив состоит из одного элемента, то он определяет значение
символьного поля. В противном случае (если в массиве больше одного элемента) из
символов массива формируется текстовая строка и присваивается значением текстовому полю.*/


import java.lang.reflect.Array;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        char_or_str obj = new char_or_str();
        Scanner in = new Scanner(System.in);
        int com=0;
        do {
            System.out.println("Choose an action\n1 - Edit char\n2 - Edit string\n3 - Edit with array\n4 - Show fields\n0 - Exit");
            do {
                System.out.print("Enter com:");
                com = in.nextInt();
                in.nextLine();
                switch (com){
                    case(0):break;
                    case(1):
                    {
                        System.out.print("Enter char:");
                        char new_char= in.next().charAt(0);
                        obj.edit(new_char);
                        break;
                    }
                    case(2):
                    {
                        System.out.print("Enter string:");
                        String new_string=in.nextLine();
                        obj.edit(new_string);
                        break;
                    }
                    case(3):
                    {
                        System.out.print("Enter array:");
                        String new_string=in.nextLine();
                        char[] new_char_array=new_string.toCharArray();
                        obj.edit(new_char_array);
                        break;
                    }
                    case(4):obj.show();break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>4)||(com<0));
        }
        while(com!=0);
    }
}

class char_or_str
{
    private char char_field;
    private String string_field;
    public void edit(char new_char)
    {
        char_field=new_char;
    }
    public void edit(String new_string)
    {
        string_field=new_string;
    }
    public void edit(char[] new_char_arr)
    {
        if(new_char_arr.length>1)
        {
            string_field="";
            for(int i=0;i< new_char_arr.length;i++)string_field+=new_char_arr[i];
        }
        else char_field= Array.getChar(new_char_arr,0);
    }
    public void show()
    {
        System.out.println("Char - "+char_field+"\nString - "+string_field);
    }
}