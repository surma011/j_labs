/*Выполнить задания:
	Определить экспериментально, ошибки каких классов будут сгенерированны;
	Создать обработчики исключительных ситуаций с использованием выявленных классов и
	всех секций конструкции обработчика с соответствующими сообщениями, позволяющими корректно выполнить работу программы.*/

/*В программе, вычисляющей среднее значение среди положительных элементов одномерного массива(тип элементов int),
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
	ввод строки вместо числа;
	несоответствие числового типа данных;
	положительные элементы отсутствуют.*/

import java.util.Scanner;
public class task2_1 {
    public static void main(String[] args) {
        try{
            PositiveAverageArray(SetArray());}
        catch (NullPointerException e){
            System.out.println("ERROR: ("+e+")");
        }
        catch (Exception e){
            System.out.println("Invalid data entry ("+e+")");
        }

    }
    private static int[] SetArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");
        int a = in.nextInt();
        int[] Array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter int array element [" + (i + 1) + "]");
            Array[i] = in.nextInt();
        }
        return Array;
    }
    private static void PositiveAverageArray(int [] InputArray){
        double A=0;
        boolean flag = false;
        for (int j : InputArray) {
            if (j>0){
                A += j;
            }
            else if (j==0){
                flag=true;
            }
        }
        if (A <= 0 && !flag){
            throw new NullPointerException("No positive array elements");
        }
        System.out.println("Average value of positive array elements = ["+(A/InputArray.length)+"]");
    }
}
