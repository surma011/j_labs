/*Напишите программу с классом, у которого есть символьное и целочисленное поле.
В классе должны быть описаны версии конструктора с двумя аргументами (целое число и символ – определяют значения полей),
а также с одним аргументом типа double. В последнем случае действительная часть аргумента определяет код символа
(значение символьного поля), а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля.
Например, если аргументом передается число 65.1267, то значением символьного поля будет символ ‘A’ с кодом 65, а
целочисленное поле получит значение 12 (в дробной части учитываются только десятые и сотые).*/

public class task4 {
    public static void main(String[] args){
        int_char first_obj = new int_char(1,'a');
        System.out.println("\nFirst object");
        first_obj.show();
        int_char second_obj = new int_char(22.1457);
        System.out.println("\nSecond object");
        second_obj.show();
    }
}
class int_char
{
    int num;
    char ch;
    public int_char(int inc_num,char inc_char)
    {
        num=inc_num;
        ch=inc_char;
    }
    public int_char(double inc_double)
    {
        num = (int)((inc_double-((int) inc_double))*100);
        ch=Character.forDigit(((int) inc_double),36);
    }
    public void show()
    {
        System.out.println("int = "+num+"\nchar = "+ch);
    }
}
