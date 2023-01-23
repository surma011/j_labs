/*Напишите программу, в которой описан статический метод для вычисления двойного факториала числа, переданного
аргументом методу. По определению, двойной факториал числа n (обозначается как n!!) — это произведение через
одно всех чисел, не больших числа n. То есть n!! = n * (n - 2) * (n - 4)* ... (последний множитель равен 1 для
нечетного n и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. Предложите версию
метода без рекурсии и с рекурсией.*/

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value=0;
        int com=0;
        do {
            System.out.println("Choose an action\n1 - Enter value\n2 - Factorial\n3 - Recursive factorial\n0 - Exit");
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
                    case(2):fact_stock(value);break;
                    case(3):fact_rec(value,0,true);break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>3)||(com<0));
        }
        while(com!=0);

    }
    public static void fact_stock(int value)
    {
        System.out.print(value+"!!=");
        int inc=0,fact=1;
        do {
            fact=fact*(value-inc*2);
            System.out.print("("+value+"-"+(inc*2)+")x");
            inc++;
        }
        while((value-(inc*2))>=1);
        System.out.println("\b="+fact);
    }
    public static int fact_rec(int value,int inc,boolean start_flag)
    {
        if(start_flag==true)
        {
            System.out.print(value+"!!=");
            int fact=fact_rec(value,inc,false);
            System.out.println("\b="+fact);
            return 0;
        }
        else
        {
            int fact;
            System.out.print("("+value+"-"+(inc*2)+")x");
            if((value-((inc+1)*2))>=1)fact=(value-(inc*2))*fact_rec(value,(inc+1),false);
            else fact=(value-(inc*2));
            return fact;
        }
    }
}
