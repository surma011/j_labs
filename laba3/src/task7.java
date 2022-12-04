/*Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
Массив заполняется буквами «через одну», начиная с буквы ' а ': то есть массив заполняется буквами
' а ' , ' с ' , ' е ' , ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном порядке.
Размер массива задается переменной.*/


public class task7 {
    public static void main(String[] args) {
        int l = 10, char_code = 10;
        char array[] = new char[l];
        for (int i = 0; i < l; i++) {
            array[i] = Character.forDigit(char_code,32);
            System.out.print(array[i]+" ");
            char_code+=2;
        }
        System.out.print("\n");
        for(int i=(l-1);i>=0;i--)System.out.print(array[i]+" ");
    }
}
