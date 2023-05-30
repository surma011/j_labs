/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Пример работы с аргументами метода main.*/

public class task1_13 {
    public static class Main {
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("Array length= " + l);

                int h = 10 / l;
                args[l + 1] = "10";
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index doesn't exist");
            }
        }
    }
}
