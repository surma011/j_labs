/*Напишите программу, в которой пользователь вводит целое число в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон, выводится сообщение о том, что введено некорректное значение.
Используйте оператор выбора switch.*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week[1-7]: ");
        int day_num = in.nextInt();
        switch (day_num){
            case(1):System.out.println("Its Monday");break;
            case(2):System.out.println("Its Tuesday");break;
            case(3):System.out.println("Its Wednesday");break;
            case(4):System.out.println("Its Thursday");break;
            case(5):System.out.println("Its Friday");break;
            case(6):System.out.println("Its Saturday");break;
            case(7):System.out.println("Its Sunday");break;
            default:System.out.println("Number is out of range");break;
        }
    }
}