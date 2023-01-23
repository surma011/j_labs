/*Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел
1^2 + 2^2 + 3^2 + ... + n^2. Число n передается аргументом методу. Предложите версию метода с рекурсией
и без рекурсии. Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+...+n^2=(n+l) (2n + 1)/6.*/

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value=0;
        int com=0;
        do {
            System.out.println("Choose an action\n1 - Enter value\n2 - Sum square\n3 - Recursive sum square\n0 - Exit");
            do{
                System.out.print("Enter com:");
                com = in.nextInt();
                switch (com){
                    case(0):break;
                    case(1):
                    {
                        do {
                            System.out.print("Enter value:");
                            value = in.nextInt();
                            if(value<=0)System.out.println("Value must be greater than 0...");
                        }
                        while(value<=0);
                        break;
                    }
                    case(2):sum_square_stock(value);break;
                    case(3):sum_square_rec(value,1,true);break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>3)||(com<0));
        }
        while(com!=0);

    }
    public static void sum_square_stock(int value)
    {
        int result=0;
        for(int i=1;i<=value;i++)
        {
            result+=i*i;
            System.out.print(i+"^2+");
        }
        System.out.println("\b="+result);
    }
    public static int sum_square_rec(int value,int inc,boolean start_flag)
    {
        int result=0;
        System.out.print(inc+"^2+");
        if((inc+1)<=value)result+=inc*inc+sum_square_rec(value,(inc+1),false);
        else result=inc*inc;
        if(start_flag==true)System.out.println("\b="+result);
        return result;
    }
}
