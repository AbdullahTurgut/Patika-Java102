package io.writerClasses;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {

        String data = "ĞÜŞİ";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/io/writerClasses/patika.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data); // byte işlemi ile ilgilenmeden outputStreamWriter üzerinden string yazdırdık


            outputStreamWriter.close();
//            fileOutputStream.write(data.getBytes()); // tr karakterde burda sorun olmaz varsayılan encoder içeriği var
//            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
