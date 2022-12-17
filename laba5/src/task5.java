/*Напишите программу с классом, у которого есть закрытое целочисленное поле.
Значение полю присваивается с помощью открытого метода. Методу аргументом может передаваться целое число,
а также метод может вызываться без аргументов. Если методы вызывается без аргументов, то поле получает нулевое
значение. Если метод вызывается с целочисленным аргументом, то это значение присваивается полю.
Однако если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу что и метод для присваивания значения полю.
Также в классе должен быть метод, позволяющий проверить значение поля.*/

import java.util.Scanner;

public class task5 {
    public static void main(String[] args)
    {
        int_class first_obj = new int_class();
        int_class second_obj = new int_class(12);
        System.out.println("Two objects created");
        int com_ext=0;
        Scanner in = new Scanner(System.in);
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
                                    "\n1 - Edit field(stock)"+
                                    "\n2 - Edit field(custom)"+
                                    "\n3 - Show field\n0 - Exit");
                            do {
                                System.out.print("Enter com:");
                                com_int = in.nextInt();
                                switch(com_int){
                                    case(0):break;
                                    case(1):first_obj.edit_int();break;
                                    case(2):
                                    {
                                        System.out.print("Enter int:");
                                        int inc_num = in.nextInt();
                                        first_obj.edit_int(inc_num);
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
                                    "\n1 - Edit field(stock)"+
                                    "\n2 - Edit field(custom)"+
                                    "\n3 - Show field\n0 - Exit");
                            do {
                                System.out.print("Enter com:");
                                com_int = in.nextInt();
                                switch(com_int){
                                    case(0):break;
                                    case(1):second_obj.edit_int();break;
                                    case(2):
                                    {
                                        System.out.print("Enter int:");
                                        int inc_num = in.nextInt();
                                        second_obj.edit_int(inc_num);
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
class int_class
{
    private int num;
    public int_class(){num=0;}
    public int_class(int inc_num)
    {
        if(inc_num>100)num=100;
        else num=inc_num;
    }
    public void edit_int(){num=0;}
    public void edit_int(int inc_num)
    {
        if(inc_num>100)num=100;
        else num=inc_num;
    }
    public void show()
    {
        System.out.println("int = "+num);
    }
}
