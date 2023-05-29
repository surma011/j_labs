/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Чтение из одного файла и запись в другой файл дан-
ных посимвольно.*/

import java.io.*;

public class task1_6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("E:\\MyFile1.txt");
            out = new FileWriter("E:\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("ERROR!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}
