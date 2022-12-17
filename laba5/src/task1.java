/*Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
Один из методов позволяет присвоить значение полю. Еще один метод при вызове возвращает результатом код символа.
Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
 */

import java.util.Scanner;

public class task1 {
    private static char ch='a';
    public static void main(String[] args) {
        int com=0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1 - assign a value to a field;\n2 - character code;\n3 - field value and its code;\n0 - exit;");
            do {
                System.out.print("Enter com:");
                com = in.nextInt();
                switch(com){
                    case(0):System.out.println("Bye!");break;
                    case(1):assign();break;
                    case(2):char_code();break;
                    case(3):value_and_code();break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>3)||(com<0));
        }
        while(com!=0);
    }
    private static void assign()
    {
        System.out.print("Enter char: ");
        Scanner in = new Scanner(System.in);
        ch=in.next().charAt(0);
    }
    private static void char_code()
    {
        System.out.println("Char code - "+Character.getNumericValue(ch));
    }
    private static void value_and_code()
    {
        System.out.println("Field value - "+ch+"\nChar code - "+Character.getNumericValue(ch));
    }
}