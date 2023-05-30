/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Генерация исключительной ситуации в методе и дополнительное использование оператора return.*/

public class task1_9 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                return 55;
            } finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
