/*Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min).
Значение поля max не может быть меньше значения поля min. Значения полям присваиваются с помощью открытого метода.
Метод может вызываться с одним или двумя целочисленными аргументами. При вызове метода значения полям присваиваются так:
сравниваются текущие значения полей и значения аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min. Предусмотрите конструктор, который работает по тому же
принципу, что и метод для присваивания значений полям. В классе также должен быть метод, отображающий в консольном окне
значения полей объекта.*/

import java.util.Scanner;

public class task6 {
    public static void main(String[] args)
    {
        System.out.print("Enter one argument for the first object: ");
        Scanner in = new Scanner(System.in);
        int first_out_num=in.nextInt();
        max_min first_obj = new max_min(first_out_num);
        System.out.print("Enter two arguments for the second object: ");
        first_out_num=in.nextInt();
        System.out.print(":");
        int second_out_num=in.nextInt();
        max_min second_obj = new max_min(first_out_num,second_out_num);
        System.out.println("Two objects created");
        int com_ext=0;
        do {
            System.out.println("Choose object\n1 - First object\n2 - Second object\n0 - Exit");
            do {
                System.out.print("Enter com:");
                com_ext = in.nextInt();
                switch(com_ext){
                    case(0):System.out.println("Bye!");break;
                    case(1):
                    {
                        int com_int=0;
                        do {
                            System.out.println("First object -> Choose an action"+
                                    "\n1 - Edit fields(one arg)"+
                                    "\n2 - Edit fields(two args)"+
                                    "\n3 - Show fields\n0 - Exit");
                            do {
                                System.out.print("Enter com:");
                                com_int = in.nextInt();
                                switch(com_int){
                                    case(0):break;
                                    case(1):
                                    {
                                        System.out.print("Enter one arg:");
                                        first_out_num = in.nextInt();
                                        first_obj.edit(first_out_num);
                                        break;
                                    }
                                    case(2):
                                    {
                                        System.out.print("Enter two args:");
                                        first_out_num = in.nextInt();
                                        System.out.print(":");
                                        second_out_num = in.nextInt();
                                        first_obj.edit(first_out_num,second_out_num);
                                        break;
                                    }
                                    case(3):first_obj.show();break;
                                    default:System.out.println("Com is not correct");break;
                                }
                            }
                            while((com_int>3)||(com_int<0));
                        }
                        while(com_int!=0);
                        break;
                    }
                    case(2):
                    {
                        int com_int=0;
                        do {
                            System.out.println("Second object -> Choose an action"+
                                    "\n1 - Edit fields(one arg)"+
                                    "\n2 - Edit fields(two args)"+
                                    "\n3 - Show fields\n0 - Exit");
                            do {
                                System.out.print("Enter com:");
                                com_int = in.nextInt();
                                switch(com_int){
                                    case(0):break;
                                    case(1):
                                    {
                                        System.out.print("Enter one arg:");
                                        first_out_num = in.nextInt();
                                        second_obj.edit(first_out_num);
                                        break;
                                    }
                                    case(2):
                                    {
                                        System.out.print("Enter two args:");
                                        first_out_num = in.nextInt();
                                        System.out.print(":");
                                        second_out_num = in.nextInt();
                                        second_obj.edit(first_out_num,second_out_num);
                                        break;
                                    }
                                    case(3):second_obj.show();break;
                                    default:System.out.println("Com is not correct");break;
                                }
                            }
                            while((com_int>3)||(com_int<0));
                        }
                        while(com_int!=0);
                        break;
                    }
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com_ext>2)||(com_ext<0));
        }
        while(com_ext!=0);
    }
}
class max_min {
    private int max = 100, min = 0;
    public max_min(int inc_num) {
        if (inc_num > ((max + min) / 2)) max = inc_num;
        else min = inc_num;
    }
    public max_min(int first_inc_num, int second_inc_num) {
        if (first_inc_num > second_inc_num) {
            max = first_inc_num;
            min = second_inc_num;
        } else {
            max = second_inc_num;
            min = first_inc_num;
        }
    }
    public void edit(int inc_num) {
        if (inc_num > ((max + min) / 2)) max = inc_num;
        else min = inc_num;
    }
    public void edit(int first_inc_num, int second_inc_num) {
        if (first_inc_num > second_inc_num) {
            max = first_inc_num;
            min = second_inc_num;
        } else {
            max = second_inc_num;
            min = first_inc_num;
        }

    }
    public void show()
    {
        System.out.println("max = "+max+"\nmin = "+min);
    }
}
