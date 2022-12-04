/*Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются,
и значение суммы. Предложите версии программы, использующие разные операторы цикла.
 */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select implementation method[1-for;2-while]:");
        int method = in.nextInt();
        switch(method){
            case (1):task5_1();break;
            case (2):task5_2();break;
            default:System.out.println("Method not found");break;
        }
    }
    private static void task5_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int l = in.nextInt(),sum=0,num=0;
        for(int i=0;i<l;i++){
            do num++;
            while((num%5!=2)&(num%3!=1));
            System.out.print(num+"+");
            sum=sum+num;
        }
        System.out.print("\b="+sum);
    }
    private static void task5_2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int l = in.nextInt(),sum=0,num=0,i=0;
        while(i<l)
        {
            do num++;
            while((num%5!=2)&(num%3!=1));
            System.out.print(num+"+");
            sum=sum+num;
            i++;
        }
        System.out.print("\b="+sum);
    }
}
