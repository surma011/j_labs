/*Напишите программу с классом, у которого есть два символьных поля и метод. Он возвращает результат, и у него нет
аргументов. При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые находятся «между»
символами, являющимися значениями полей объекта (из которого вызывается метод). Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны выводиться все символы от ‘A’ до ‘D’ включительно.
 */


import java.util.Scanner;

public class task2 {
    private static char first_ch='a';
    private static char secpond_ch='d';
    public static void main(String[] args) {
        int com=0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1 - assign a value to a field;\n2 - character sequence;\n0 - exit;");
            do {
                System.out.print("Enter com:");
                com = in.nextInt();
                switch(com){
                    case(0):System.out.println("Bye!");break;
                    case(1):assign();break;
                    case(2):char_seq();break;
                    default:System.out.println("Com is not correct");break;
                }
            }
            while((com>2)||(com<0));
        }
        while(com!=0);
    }
    private static void assign()
    {
        System.out.print("Enter first char: ");
        Scanner in = new Scanner(System.in);
        first_ch=in.next().charAt(0);
        System.out.print("Enter second char: ");
        secpond_ch=in.next().charAt(0);
    }
    private static void char_seq()
    {
        int term=0;
        if(Character.getNumericValue(first_ch)<=Character.getNumericValue(secpond_ch))term=1;
        else term=(-1);
        for(int current_char_code=Character.getNumericValue(first_ch);
                current_char_code!=(Character.getNumericValue(secpond_ch)+term);
                current_char_code=current_char_code+term)
            System.out.print(Character.forDigit(current_char_code,36));
        System.out.print("\n");
    }
}
