/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Выполнить чтение из одного файла и запись в дру- гой
файл с использованием класса PrintWriter.*/

import java.io.*;

public class task1_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("MyFile1.txt"),"cp1251"));
            out = new PrintWriter("MyFile2.txt","cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null)
            {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
