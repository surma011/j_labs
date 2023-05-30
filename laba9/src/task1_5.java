/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Исключение не перехвачено.*/

public class task1_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ERROR");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
