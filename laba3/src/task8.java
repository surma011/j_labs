/*Напишите программу, в которой создается символьный массив из 10 элементов.
Массив заполнить большими (прописными) буквами английского алфавита. Буквы берутся подряд,
но только согласные (то есть гласные буквы ’ А ' , ' Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном окне.*/


public class task8 {
    public static void main(String[] args) {
        int l = 10, char_code = 10,a_code=10,e_code=14,i_code=18;
        char array[] = new char[l];
        for (int i = 0; i < l; i++) {
            while(
                (char_code==a_code)|
                (char_code==e_code)|
                (char_code==i_code)
                    )char_code+=1;
            array[i] = Character.toUpperCase(Character.forDigit(char_code,32));
            System.out.print(array[i]+" ");
            char_code+=1;
        }
    }
}
