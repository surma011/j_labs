/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Создать первый файл на диске и записать в него заданное
количество вещественных чисел. Далее создать второй файл и переписать в него
все числа из первого файла.*/

import java.io.*;
import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("How many real numbers to write to the file?");
            int count = sc.nextInt();
            System.out.println("Enter numbers:");
            for (int i = 0; i < count; i++)wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();
            File f2 = new File("numRez.txt");
            f2.createNewFile();
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try {
                while(true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Number " + (float)number);
                }
            } catch(EOFException e){}
            wr.flush();
            wr.close();
            rd.close();
        } catch(IOException e) {
            System.out.println("End of file");
        }
    }
}
