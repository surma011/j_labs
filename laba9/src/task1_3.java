/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Перехват исключений подходящим классом.*/

public class task1_3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ERROR");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
