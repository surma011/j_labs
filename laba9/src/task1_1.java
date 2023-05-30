/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Сгенерировано и перехвачено RuntimeException.*/

public class task1_1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw  new RuntimeException("Unchecked error");
        } catch (RuntimeException e) {
            System.out.println("1  "+ e);
        }
        System.out.println("2");
    }
}