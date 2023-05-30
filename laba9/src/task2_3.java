/*Выполнить задания:
	Определить экспериментально, ошибки каких классов будут сгенерированны;
	Создать обработчики исключительных ситуаций с использованием выявленных классов и
	всех секций конструкции обработчика с соответствующими сообщениями, позволяющими корректно выполнить работу программы.*/

/*В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
	ввод строки вместо числа;
	ввод или вычисление значения за границами диапазона типа.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        ESetArray();
        SumArray(StatArray);

    }
    private static byte[] StatArray;

    private static void ESetArray(){
        try{SetArray();}
        catch (InputMismatchException e){
            System.out.println("Enter a valid value ("+e+")");
            ESetArray();
        }
        catch (Exception e){
            System.out.println("ERROR: ("+e+")");
            ESetArray();
        }

    }
    static class ByteRangeException extends InputMismatchException{
        ByteRangeException(){
            super("Value out of range byte");
        }
    }
    private static void EInput(int i) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter byte array element "+"["+(i+1)+"]");
            int temp=0;
            try{
                temp=scan.nextInt();
                if(temp<-128||temp>127){
                    throw new ByteRangeException();}
            }catch(ByteRangeException e){
                System.out.println("Value out of range byte ("+e+")");
                EInput(i);}
            StatArray[i] = (byte)temp;
        }
        catch(InputMismatchException e){
            System.out.println("Enter value ("+e+")");
            EInput(i);}


    }
    private static void SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length");
        int a = scan.nextInt();
        StatArray = new byte[a];
        for(int i=0;i<a;i++){
            EInput(i);
        }
    }

    private static void SumArray(byte [] InputArray){
        int A=0;
        for (int j : InputArray) {
            A += (int) j;
        }
        System.out.println("Sum of array elements = ["+(A)+"]");
    }
}
