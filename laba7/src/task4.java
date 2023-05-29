/*Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.*/


public class task4 {
    public static void main(String[] args) {
        subClass_task4 sub = new subClass_task4('W', "Subclass constructor");
        subSubClass_task4 SubSub = new subSubClass_task4('E', "Subsubclass constructor", 10);
        superClass_task4 test = new subSubClass_task4(SubSub);
        System.out.println(test.ch);
        System.out.println(sub.ch +" "+ sub.str);
        System.out.println(SubSub.ch +" "+ SubSub.str +" "+ SubSub.integer);
    }

}

class superClass_task4 {
    public char ch;
    superClass_task4(char ch) {
        this.ch = ch;
    }
    superClass_task4(superClass_task4 sp) {
        this.ch = sp.ch;
    }
}

class subClass_task4 extends superClass_task4{
    public String str;
    subClass_task4(char ch, String str) {
        super(ch);
        this.str = str;
    }
    subClass_task4(subClass_task4 sub) {
        super(sub);
        this.str = sub.str;
    }
}

class subSubClass_task4 extends subClass_task4{
    public int integer;

    subSubClass_task4(char ch, String str, int integer) {
        super(ch,str);
        this.integer = integer;
    }
    subSubClass_task4(subSubClass_task4 subSub) {
        super(subSub);
        this.integer = subSub.integer;
    }
}
