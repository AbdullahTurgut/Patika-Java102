package io.readersClasses;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/io/readersClasses/patika.txt");//okuma işlemi

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); // tr karakter olayını düzeltmek için
            System.out.println(inputStreamReader.getEncoding()); // çıktı -> UTF8
            int i = inputStreamReader.read();
            while (i != -1){
                System.out.print((char)i);
                i = inputStreamReader.read(); // bu şekilde tr karakterleride okuyabiliriz
            }
//            int i = fileInputStream.read();
//            while(i != -1){
//                System.out.print((char) i); // çıktıda tr karakterler sorun yapar
//                i = fileInputStream.read();
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
