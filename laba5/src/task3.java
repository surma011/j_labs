/*Напишите программу с классом, у которого есть два целочисленных поля. В классе должны быть описаны конструкторы,
позволяющие создавать объекты без передачи аргументов, с передачей одного аргумента и с передачей двух аргументов.*/

public class task3 {
    public static void main(String[] args){
        two_int first_obj = new two_int();
        System.out.println("\nFirst object");
        first_obj.show_int();
        two_int second_obj = new two_int(5);
        System.out.println("\nSecond object");
        second_obj.show_int();
        two_int third_obj = new two_int(7,15);
        System.out.println("\nThird object");
        third_obj.show_int();
    }
}

class two_int
{
    int first_int,second_int;
    public two_int(){
        first_int=1;
        second_int=2;
    }
    public two_int(int a)
    {
        first_int=a;
        second_int=0;
    }
    public two_int(int a,int b)
    {
        first_int=a;
        second_int=b;
    }
    public void show_int()
    {
        System.out.println("first int = "+first_int+"\nsecond int = "+second_int);
    }
}
