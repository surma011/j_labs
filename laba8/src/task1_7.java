/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Чтение из одного файла и запись в другой файл дан-
ных построчно с использованием буфера в 1 килобайт.*/

import java.io.*;

public class task1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            br = new BufferedReader(new FileReader("E:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("E:\\MyFile2.txt"));

            int lineCount = 0;
            String s;

            while((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch(IOException ex) {
            System.out.println("ERROR!!!" + ex);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
