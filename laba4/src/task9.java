/*(дополнительная задача). Напишите программу «Шифр Цезаря», в которой необходимо реализовать собственный алфавит,
остальные условия идентичны задаче 8

#8
Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
Используете кодовую таблицу символов. При запуске программы в консоль необходимо вывести сообщение:
«Введите текст для шифрования», после ввода текста, появляется сообщение:
«Введите ключ». После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».*/

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to encrypt: ");
        String enter_str=in.nextLine();
        char[] custom_alp={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        System.out.print("Text after conversion: ");
        int[] str_code_arr=new int[enter_str.length()];
        for(int i=0;i<str_code_arr.length;i++)
        {
            str_code_arr[i]=Character.getNumericValue(enter_str.toCharArray()[i]);
            if((str_code_arr[i]>=10)&(str_code_arr[i]<=35))
            {
                str_code_arr[i]=str_code_arr[i]-10;
                System.out.print(custom_alp[str_code_arr[i]]);
            }
            else System.out.print(enter_str.toCharArray()[i]);
        }
        char ans;
        do {
            System.out.print("\nPerform reverse transformation?(y/n): ");
            ans = in.next().charAt(0);
            switch(ans) {
                case ('y'):
                {
                    System.out.print("Decoded string: ");
                    for(int i=0;i<str_code_arr.length;i++)
                    {
                        if((str_code_arr[i]>=10)&(str_code_arr[i]<=35))
                        {
                            str_code_arr[i]=str_code_arr[i]+10;
                            System.out.print(Character.forDigit(str_code_arr[i],36));
                        }
                        else System.out.print(enter_str.toCharArray()[i]);
                    }
                    break;
                }
                case('n'):System.out.println("Goodbye!");break;
                default:System.out.print("Enter the correct answer.");break;
            }
        }
        while((ans!='y')&(ans!='n'));
    }
}
