/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Прочитать и вывести на экран информацию из трех источников: файла
на диске, интернет-страницы и массива данных типа byte. Указать кодировку,
поддерживающую кириллицу. (Сравнить с работой программы, приведенной в
примере 2.)*/

import java.io.*;
import java.net.URL;

public class task1_8 {
    public static void main(String[] args)
    {
        try {
            InputStream inFile = new FileInputStream("MyFile1.txt");
            Reader rFile= new InputStreamReader(inFile,"cp1251");
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl=new InputStreamReader(inUrl, "cp1251");
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
            InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11});
            Reader rArray=new InputStreamReader(inArray,"cp1251" );
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("ERROR: "+ e);
        }
    }

    public static void readAllByByte( Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " end ");
                break;
            }
        }
    }
}
