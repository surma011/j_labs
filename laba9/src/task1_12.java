/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Исключения IllegalArgumentException - неверные аргументы.*/

public class task1_12 {
    public static class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Str entered incorrect");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Wrong Double");
            }
        }

        public static void main(String[] args) {
            m(null, 0.000001);
        }
    }
}
