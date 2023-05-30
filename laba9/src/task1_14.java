/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Обработка исключений, порождённого одним методом m() в другом(в методе main).*/

public class task1_14 {
    public static class Main {
        public static void m(int x) throws ArithmeticException {
            int h = 10 / x;
        }

        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("Array length= " + l);
                m(l);
            } catch (ArithmeticException e) {
                System.out.println("ERROR: Division by zero");
            }
        }
    }
}
