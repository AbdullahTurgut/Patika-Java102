package io.bufferedInputandOutputStreams;


//import java.io.BufferedInputStream;
//import java.io.FileInputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        // ********** BufferedOutputStream **********
        String data = "Sonradan eklenecek string";
        try {
            FileOutputStream file = new FileOutputStream("src/io/bufferedInputandOutputStreams/patika.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(file);

            byte[] byteArray = data.getBytes();

            bufferedOutputStream.write(byteArray);

            bufferedOutputStream.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // *********** BufferedInputStream ************
//        try {
//            FileInputStream fileInput = new FileInputStream("src/io/bufferedInputandOutputStreams/patika.txt");
//            // buffered büyük verilerde daha verimli (HIZ KONUSUNDA) hafıza kullanımıda
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInput);
//
//            int i = bufferedInputStream.read();
//            while (i != -1){
//                System.out.print((char) i);
//                i = bufferedInputStream.read();
//            }
//        } catch (Exception e) {
//            e.getMessage();
//        }
    }
}
