package io.bufferedReaderAndWriterClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // ***** BufferedWriter Class **********
            String data = "JAVAÖĞRENİYORUM";

            File dosya = new File("src/io/bufferedReaderAndWriterClasses/output.txt");

        try {
            FileWriter fileWriter = new FileWriter(dosya);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);

            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ***** BufferedReader Class **********
//        try {
//            FileReader fileReader = new FileReader("src/io/bufferedReaderAndWriterClasses/patika.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader); // patika içerisindeki verileri okuyabiliriz
//
//            String line  = bufferedReader.readLine();
//            while(line != null){ // satırda bir şey vardır ve o değeri yazdırabiliriz
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//            /*
//            2. YOL
//            String line;
//            while((line = bufferedReader.readLine()) != null){
//                System.out.print(line + " #### ");
//            }
//            */
//            bufferedReader.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
