/*Выполнить задания:
	Определить экспериментально, ошибки каких классов будут сгенерированны;
	Создать обработчики исключительных ситуаций с использованием выявленных классов и
	всех секций конструкции обработчика с соответствующими сообщениями, позволяющими корректно выполнить работу программы.*/

/*В программе, где требуется из матрицы вывести столбец с номером, заданными с клавиатуры,
могут возникать ошибки в следующих случаях:
	ввод строки вместо числа;
	нет столбца с таким номером.
*/

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        EMatrix();
        EPrintColumn();
    }

    private static void EMatrix() {
        try {PrintMatrix(CreateMatrix());}
        catch(NegativeArraySizeException e){
            System.out.println("Invalid matrix size entred ("+e+")");
            EMatrix();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid matrix parameter entered ("+e+")");
            EMatrix();
        }
    }

    private static void EPrintColumn(){
        try{PrintColumn();}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Column outside matrix ("+e+")");
            EPrintColumn();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid column parameter entered ("+e+")");
            EPrintColumn();
        }
    }

    private static int width;
    private static int height;
    private static int[][] MatrixStat;

    private static void PrintMatrix(int[][] Array) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("[" + (j+1) + "][" + (i+1) + "]=" + Array[j][i]+"\t"); //печать
            }
            System.out.println();
        }
    }
    private static int [][] CreateMatrix(){
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("Enter matrix width: ");
        width = id.nextInt();
        System.out.print("Enter matrix height: ");
        height = id.nextInt();
        int [][] Matrix = new int [width][height];
        for (int i = 0 ; i <width; i++) {
            for (int j = 0 ; j <height; j++) {
                Matrix[i][j] = random.nextInt(200);
            }
        }
        MatrixStat = Matrix;
        return Matrix;
    }
    private static void PrintColumn(){
        Scanner id = new Scanner(System.in);
        System.out.print("Select matrix column: ");
        int column = id.nextInt();
        for(int i = 0; i<height;i++){
            System.out.print("[" + column + "][" + (i+1) + "]=" + MatrixStat[column-1][i]+"\n");
        }
    }
}
