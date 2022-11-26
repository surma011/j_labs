/*Напишите программу, в которой Пользователь последовательно вводит название текущего дня
недели, название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц)*/


import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day of week\n[Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday]");
        String dow = in.nextLine();
        if(
                (dow.equals("Monday"))|
                        (dow.equals("Tuesday"))|
                        (dow.equals("Wednesday"))|
                        (dow.equals("Thursday"))|
                        (dow.equals("Friday"))|
                        (dow.equals("Saturday"))|
                        (dow.equals("Sunday"))
        )
        {
            System.out.println("Enter month\n[January/February/March/April/May/June/July/August/August/September/September/October/November/December]");
            String month = in.nextLine();
            if(
                    (month.equals("January"))|
                            (month.equals("February"))|
                            (month.equals("March"))|
                            (month.equals("April"))|
                            (month.equals("May"))|
                            (month.equals("June"))|
                            (month.equals("July"))|
                            (month.equals("August"))|
                            (month.equals("September"))|
                            (month.equals("October"))|
                            (month.equals("November"))|
                            (month.equals("December "))
            )
            {
                System.out.println("Enter date:");
                int date = in.nextInt();
                if((date>0)&(date<32))
                {
                    System.out.println("\nYour enter date: "+dow+" "+date+" "+month);
                    Date system_date = new Date();
                    Locale.setDefault(Locale.ENGLISH);
                    System.out.printf("%s %tA %<te %<tB","Current date: ", system_date);
                }
                else System.out.println("That is not date");
            }
            else System.out.println("That is not month");
        }
        else System.out.println("That is not day of week");
    }
}