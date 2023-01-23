/*Напишите программу с классом, в котором есть закрытое статическое целочисленное поле с начальным нулевым значением.
В классе должен быть описан статический метод, при вызове которого отображается текущее значение статического поля,
после чего значение поля увеличивается на единицу.*/

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int com=0;
        do {
            System.out.println("Choose an action\n1 - Show and increase field\n0 - Exit");
            do{
                System.out.print("Enter com:");
                com = in.nextInt();
                switch (com){
                    case(0):break;
                    case(1):prv_st_field.show_inc_field();break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>1)||(com<0));
        }
        while(com!=0);
    }
}

class prv_st_field
{
    private static int field=0;
    public static void show_inc_field()
    {
        System.out.println("Field = "+field);
        field++;
        System.out.println("Field value increased");
    }
}