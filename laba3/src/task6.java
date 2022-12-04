/*Напишите программу, в которой создается одномерный числовой массив и заполняется числами,
которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного значения.*/

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Еnter the length of the array:");
        int l = in.nextInt();
        if (l > 0) {
            int array[] = new int[l];
            array[0] = 0;
            for (int i = 0; i < l; i++) {
                if (i!=0) array[i]=array[i-1];
                do array[i]++;
                while (array[i] % 5 != 2);
                System.out.print(array[i]+" ");
            }
        } else System.out.println("Incorrect array length");
    }
}
