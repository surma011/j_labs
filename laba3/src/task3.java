/*Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел в последовательностивводится пользователем.
Предложите версии программы, использующие разные операторы цикла.*/


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select implementation method[1-for;2-while]:");
        int method = in.nextInt();
        switch(method){
            case (1):task3_1();break;
            case (2):task3_2();break;
            default:System.out.println("Method not found");break;
        }
    }
    private static void task3_1() {
        System.out.println("Method - for");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the sequence:");
        int l = in.nextInt();
        int n=1,nm1=0,nm2=0;
        System.out.print("\n");
        for(int i=0;i<l;i++)
        {
            System.out.print(n+" ");
            nm2=nm1;
            nm1=n;
            n=nm1+nm2;
        }
    }
    private static void task3_2() {
        System.out.println("Method - while");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the sequence:");
        int l = in.nextInt();
        int i=0,n=1,nm1=0,nm2=0;
        System.out.print("\n");
        while(i<l)
        {
            System.out.print(n+" ");
            nm2=nm1;
            nm1=n;
            n=nm1+nm2;
            i++;
        }
    }
}

