/*Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей.
 */
public class task1 {
    public static void main(String[] args) {
        superClass_task1 superClassObject = new superClass_task1("string for superclass");
        String className = superClassObject.toString();
        System.out.println(className);
        subClass_task1 subClassObject1 = new subClass_task1 ("string for subclass");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        subClass_task1 subClassObject2 = new subClass_task1("first string for subclass", "second string for subclass");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

class superClass_task1 {
    private String str1;
    superClass_task1(String strEx) {
        this.str1 = strEx;
    }
    superClass_task1() {
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue ;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
class subClass_task1 extends superClass_task1 {
    private String str2;
    private String str3;
    subClass_task1(String strEx) {
        super(strEx);
    }
    subClass_task1(String strEx2, String strEx3){
        this.str2 = strEx2;
        this.str3 = strEx3;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2 + "\n" +
                " str 3 = " + this.str3;
        return ClassNameAndFieldValue ;
    }
}