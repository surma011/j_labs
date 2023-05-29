/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

///Создание файлов и папок

import java.io.File;

public class task1_1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Created!!!!");
                System.out.println("Full path 1: "+ f1.getAbsolutePath());
            }
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println( "Full path 2: " + f2.getAbsolutePath());
            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Full path 3: "+ f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("ERROR!!! " + e);
        }
    }
}