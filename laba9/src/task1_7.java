/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Нельзя перехватить брошенное исключение с помощью чужого catch, даже если перехватчик подходит.*/

public class task1_7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ERROR");
        } catch (NullPointerException e) {
            System.out.println("1");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
