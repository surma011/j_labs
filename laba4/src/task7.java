/*Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
сначала первая строка (слева направо), затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.*/

import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        Random num = new Random();
        int l = num.nextInt(10 + 1);
        int[][] array = new int[l][];
        for (int i = 0; i < l; i++) array[i] = new int[l];
        for(int i_l=0;i_l<l;i_l++)
        {
            int i_c=0;
            for(;i_c<(l-i_l-1);i_c++)array[i_l][i_c]=1;
            for(int i_l_r=(l-1);i_l_r>=i_l;i_l_r--)array[i_l_r][i_c]+=1;
        }
    }
}
