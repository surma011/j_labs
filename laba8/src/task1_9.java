/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Чтение из одного файла и запись в другой файл данных
построчно с использованием буферизации символьных потоков основанных на
байтовых файловых потоках.*/

import java.io.*;

public class task1_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("MyFile1.txt"),"cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("MyFile2.txt"),"cp1251"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        }
        catch (IOException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
