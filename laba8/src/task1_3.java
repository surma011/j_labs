/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Прочитать и вывести на экран информацию из предварительно
созданного файла с использованием буфера в 5 байт.*/

import java.io.*;
import java.util.Arrays;

public class task1_3 {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while(true) {
            int count = in.read(buff);
            if(count != -1) {
                System.out.println("Quantity: " + count +
                        " buff: " + Arrays.toString(buff) +
                        ", str = " + new String(buff, 0, count, "cp1251"));
            } else {break;}
        }
    }

    public static void main(String[] args) {
        String fileName = "E:\\MyFile.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch(IOException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if(inFile != null) {
                try {
                    inFile.close();
                } catch(IOException ignore){}
            }
        }
    }
}
