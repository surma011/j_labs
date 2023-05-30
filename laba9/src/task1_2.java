/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Исключение перехвачено перехватчиком предка.*/

public class task1_2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Unchecked error");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
