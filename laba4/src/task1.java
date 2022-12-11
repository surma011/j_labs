/*Напишите программу, которая выводить в консольное окно прямоугольник,
размеры сторон которого, ширина: 23 колонки, высота: 11 строк.*/


public class task1 {
    public static void main(String[] args) {
        int w=23,h=11;
        for(int i_ext=0;i_ext<h;i_ext++)
        {
            for (int i_int = 0; i_int < w; i_int++)
            {
                if((i_ext==0)|(i_ext==(h-1)))System.out.print("X");
                else if((i_int==0)|(i_int==(w-1)))System.out.print("X");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}