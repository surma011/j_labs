/*Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
вторую строку и положительные числа.*/

import java.io.*;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DataOutputStream wr1 = null;
        DataOutputStream wr2 = null;
        DataInputStream rd = null;
        System.out.print("Enter a file name: ");
        String fname = sc.nextLine();
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            File f2 = new File("result");
            f2.createNewFile();
            wr1 = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            wr2 = new DataOutputStream(new FileOutputStream("result"));
            rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            System.out.println("Enter 2 lines to write:");
            for (int i = 0; i < 2; i++) {
                wr1.writeUTF(sc.nextLine());
            }
            System.out.println("Enter 5 real numbers:");
            for (int i = 0; i < 5; i++) {
                wr1.writeDouble(sc.nextDouble());
            }
            wr1.flush();
            wr1.close();
            String[] strings = new String[2];
            double[] doubles = new double[5];
            for (int i = 0; i < 2; i++) {
                strings[i] = rd.readUTF();
            }
            for (int i = 0; i < 5; i++) {
                doubles[i] = rd.readDouble();
            }
            rd.close();
            wr2.writeUTF(strings[1]);
            for (int i = 0; i < 5; i++) {
                if(doubles[i] > 0)
                    wr2.writeDouble(doubles[i]);
            }
            wr2.flush();
            wr2.close();
            System.out.println("DONE");
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex);
        }
    }
}
