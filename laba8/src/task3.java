/*Создать проект, позволяющий из одного текстового файла,
содержащего несколько строк (тип String) заранее подготовленного текста
на русском языке (Пушкин, Лермонтов или другой российсмки классик на
Ваш вкус), построчно переписать в другой текстовый файл слова
начинающиеся с согласных букв.
Требования:
– слова из предложения выделять методом split();
– в новом файле следует указать номер строки, в которой иско- мые
слова находились в исходном файле;
– для каждой строки указать количество выбранных слов.*/

import java.io.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fname = sc.nextLine();
        BufferedWriter wr = null;
        BufferedReader rd = null;
        try {
            File f1 = new File(fname);
            File f2 = new File("result");
            f2.createNewFile();
            wr = new BufferedWriter(new FileWriter(f2.getAbsolutePath()));
            rd = new BufferedReader(new FileReader(f1.getAbsolutePath()));
            String resStr = "qQwWeErRtTyYuUiIoOpP";
            String str = null;
            while((str = rd.readLine()) != null) {
                int numberLine = 0;
                int countWords = 0;
                String[] words = str.split(" ");
                for(String w: words) {

                    if(resStr.indexOf(w.charAt(0)) > -1) {
                        countWords++;
                        wr.write(numberLine + ": " + w + "\n");
                    }
                }
                numberLine++;
                wr.write("For " + numberLine + " lines written out " + countWords + " word(s) " + "\n");
            }
            System.out.println("Done");
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            rd.close();
            wr.flush();
            wr.close();
        }
    }
}
