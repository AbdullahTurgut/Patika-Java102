package io.fileReaderAndWriterClasses;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String data = "JAVA ÖĞRENİYORUM !";
        try {
            FileWriter fileWriter = new FileWriter("src/io/fileReaderAndWriterClasses/patika.txt");
            fileWriter.write(data);//

            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // ****** FileReader CLASS **********
//        try {
//            FileReader fileReader = new FileReader("src/io/fileReaderAndWriterClasses/patika.txt");
//
//            // bu sınıf ile direk tr karakterlerle okuma yapabiliyoruz
//            int i = fileReader.read();
//            while (i != -1){
//                System.out.print((char) i);
//                i = fileReader.read();
//            }
//
//            fileReader.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
