/*Напишите программу, в которой пользователю предлагается ввести название месяца и количество
дней в этом месяце. Программа выводит сообщение о том, что соответствующий месяц содержит
указанное количество дней*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
                        (month.equals("December"))
        )
        {
            int year;
            if(month.equals("February"))
            {
                System.out.println("Enter year");
                year = in.nextInt();
            }
            else year = Integer.parseInt(String.format("%tY",new Date()));
            int month_numb=0;
            switch (month){
                case("January"):month_numb=0;break;
                case("February"):month_numb=1;break;
                case("March"):month_numb=2;break;
                case("April"):month_numb=3;break;
                case("May"):month_numb=4;break;
                case("June"):month_numb=5;break;
                case("July"):month_numb=6;break;
                case("August"):month_numb=7;break;
                case("September"):month_numb=8;break;
                case("October"):month_numb=9;break;
                case("November"):month_numb=10;break;
                case("December"):month_numb=11;break;}
            System.out.print("Enter the number of days of the month: ");
            int numb_days = in.nextInt();
            int days_in_month = new GregorianCalendar(year,month_numb,1).getActualMaximum(Calendar.DAY_OF_MONTH);
            if(numb_days==days_in_month)System.out.print("The specified month contains the specified number of days.");
            else System.out.print("The specified month does not contain the specified number of days.");
        }
        else System.out.println("That is not month");
    }
}