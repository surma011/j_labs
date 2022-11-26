/*Напишите программу, в которой пользователь вводит число, а программой отображается
последовательность из четырех чисел:
число, на единицу меньше введённого,
введенное число
и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
 */

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one number:");
        int numb = in.nextInt();
        System.out.println("\nSubsequence:\n"+
                (numb-1)+"\n"+
                numb+"\n"+
                (numb+1)+"\n"+
                (Math.pow(((numb-1)+numb+(numb+1)),2))
        );
    }
}