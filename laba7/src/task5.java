/*Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.*/

public class task5 {
    public static void main(String[] args) {
        superClass_task5 superObj = new superClass_task5("Superclass string");
        subClass1_task5 subObj1 = new subClass1_task5("First Subclass string", 10);
        subClass2_task5 subObj2 = new subClass2_task5("Second Subclass string", 'Q');
        superObj.showValue();
        System.out.println();
        subObj1.showValue();
        System.out.println();
        subObj2.showValue();
    }
}

class superClass_task5 {
    protected String str;
    superClass_task5(String str) {
        this.str = str;
    }
    public void showValue() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                "Str Field Value = " + this.str);
    }
}

class subClass1_task5 extends superClass_task5{
    protected int integer;
    subClass1_task5(String str, int integer) {
        super(str);
        this.integer = integer;
    }
    public void showValue() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                "Str Field Value = " + this.str + "\n" +
                "Int Field Value = " + this.integer);
    }
}

class subClass2_task5 extends superClass_task5{
    protected char ch;
    subClass2_task5(String str, char ch) {
        super(str);
        this.ch = ch;
    }
    public void showValue() {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                "Str Field Value = " + this.str + "\n" +
                "Char Field Value = " + this.ch);
    }
}
