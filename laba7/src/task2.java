/*Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый)*/


public class task2 {
    public static void main(String[] args) {
        superClass_task2 sup = new superClass_task2("Constructor with 1 arg");
        System.out.println("Constructor with 1 arg(22) - " + sup.getLengthStr());
        sup.setValue();
        System.out.println("Method without args(19) - " + sup.getLengthStr());
        sup.setValue("Line length 14");
        System.out.println("Line length 14 - " + sup.getLengthStr());
        subClass_task2 sub = new subClass_task2(10, "Constructor with 2 arg:");
        System.out.println("Constructor with 2 arg\nLine length(23) - " + sub.getLengthStr() +
                "\nSubclass field value(10) - " + sub.integer);
        sub.setValue(50, "Subclass method");
        System.out.println("Constructor with 2 arg (int, String):\n" +
                "Subclass field value (50) - " + sub.integer +
                "\nLine length (15) - " + sub.getLengthStr());
    }
}

class superClass_task2 {
    private String str = "privet";
    public void setValue() {
        this.str = "Method without args";
    }
    public void setValue(String str) {
        this.str = str;
    }
    superClass_task2 (String str) {
        this.str = str;
    }
    public int getLengthStr() {
        return str.length();
    }
}
class subClass_task2 extends superClass_task2{
    public int integer;
    @Override
    public void setValue() {
        super.setValue();
    }
    @Override
    public void setValue(String str) {
        super.setValue(str);
    }
    public void setValue(int integer) {
        this.integer = integer;
    }
    public void setValue(int integer, String str) {
        super.setValue(str);
        this.integer = integer;
    }
    subClass_task2(int integer, String str) {
        super(str);
        this.integer = integer;
    }
}