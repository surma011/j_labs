/*Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе
(определяется четвертая цифра справа в десятичном представлении числа).*/

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int numb = in.nextInt();
        if(numb/1000>0) System.out.println("4th digit = "+((numb/1000)%10));
        else System.out.println("4th digit is missing");
    }
}
