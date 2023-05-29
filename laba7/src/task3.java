/*Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.*/

public class task3 {
    public static void main(String[] args) {
        superClass_task3 sup = new superClass_task3(10);
        subClass_task3 sub = new subClass_task3(20, 'U');
        subsubClass_task3 subSub = new subsubClass_task3(30, 'R', "subSub");
        System.out.println(sup.toString());
        System.out.println(sub.toString());
        System.out.println(subSub.toString());
    }
}

class superClass_task3 {
    public int integer;
    public void setValue(int integer) {
        this.integer = integer;
    }
    superClass_task3(int integer) {
        this.integer = integer;
    }
    @Override
    public String toString() {
        String str;
        str = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer = " + this.integer;
        return str ;
    }
}

class subClass_task3 extends superClass_task3{
    public char ch;

    public void setValue(int integer, char ch) {
        this.integer = integer;
        this.ch = ch;
    }
    subClass_task3(int integer, char ch) {
        super(integer);
        this.ch = ch;
    }
    @Override
    public String toString() {
        String str;
        str = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer = " + super.integer + "\n" +
                " ch = " + this.ch;
        return str ;
    }

}

class subsubClass_task3 extends subClass_task3{
    public String str;
    public void setValue(int integer, char ch, String str) {
        this.integer = integer;
        this.ch = ch;
        this.str = str;
    }
    subsubClass_task3(int integer, char ch, String str) {
        super(integer, ch);
        this.str = str;
    }
    @Override
    public String toString() {
        String str;
        str = "subSub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer = " + super.integer + "\n" +
                " ch = " + super.ch + "\n" +
                " str = " + this.str;
        return str ;
    }
}
