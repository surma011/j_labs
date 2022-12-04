/*Напишите программу, в которой пользователю предлагается ввести название дня недели. По введенному названию программа
определяет порядковый номер дня в неделе. Если пользователь вводит неправильное название дня, программа выводит сообщение
 о том, что такого дня нет. Предложите версию программы на основе вложенных условных операторов и на основе оператора
 выбора switch.*/


import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Select implementation method[1-switch;2-if]:");
        int method = in.nextInt();
        switch(method){
            case(1):task2_1();break;
            case(2):task2_2();break;
            default:System.out.println("Method not found");break;
        }
    }
    private static void task2_1(){
        System.out.println("Method - switch");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of week\n[Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday]\n:");
        String dow = in.nextLine();
        switch(dow) {
            case("Monday"):System.out.println("1st day of the week");break;
            case("Tuesday"):System.out.println("2nd day of the week");break;
            case("Wednesday"):System.out.println("3rd day of the week");break;
            case("Thursday"):System.out.println("4th day of the week");break;
            case("Friday"):System.out.println("5th day of the week");break;
            case("Saturday"):System.out.println("6th day of the week");break;
            case("Sunday"):System.out.println("7th day of the week");break;
            default:System.out.println("Day number not found");break;
        }
    }
    private static void task2_2(){
        System.out.println("Method - if");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of week\n[Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday]\n:");
        String dow = in.nextLine();
        if(dow.equals("Monday"))System.out.println("1st day of the week");
        else if(dow.equals("Tuesday"))System.out.println("2nd day of the week");
        else if(dow.equals("Wednesday"))System.out.println("3rd day of the week");
        else if(dow.equals("Thursday"))System.out.println("4th day of the week");
        else if(dow.equals("Friday"))System.out.println("5th day of the week");
        else if(dow.equals("Saturday"))System.out.println("6th day of the week");
        else if(dow.equals("Sunday"))System.out.println("7th day of the week");
        else System.out.println("Day number not found");
    }
}
