/*В отдельных проектах выполнить примеры 1 – 10
лабораторной работы. Протестировать программы с помощью отладчика.
Выявить различие в работе программ в примерах 7 и 8*/

/*Создать файл на диске, ввести заданное с клавиату- ры
количество строк текста и записать их в файл в формате UTF-8.*/

import java.io.*;
import java.util.Scanner;

public class task1_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter file name => ");
        String fname = sc.nextLine();

        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Full path: "+ f1.getAbsolutePath());
            System.out.print("Enter the number of lines to write to the file => ");
            int n=sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter a string to write to file => ");
                String s = sc.nextLine();
                dOut.writeUTF(s );
            }
            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        } catch (Exception ex) {
            System.out.println();
        }
    }
}
