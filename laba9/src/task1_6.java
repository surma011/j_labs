/*Воспроизвести примеры 1-14 лабораторной работы при отправке в удалённый репозиторий, исправить ошибки.*/

/*Последовательность перехвата должна соответствовать иерархии классов исключений. Предок не должен перехватывать исключение раньше потомка.*/

public class task1_6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ERROR");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("4");
    }

}
