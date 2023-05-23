package io.fileOutputStreams;

import  java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
         // dosyaya byte byte aktarmak için fileOutputStreamler kullanılıyor
        String text = "\nOutputStream ogreniyorum.\nPatika"; // patika.txt ye eklemek için veri byte türünde olmalı

        try {
            // **** FileOutputStream dosya yoksa oluşturur ****
            FileOutputStream fileOutputStream = new FileOutputStream("src/io/fileOutputStreams/patika.txt",true);
            // 2. parametre append:true olarak verirsek dosyamızın içinde veri varsa sonuna ekler
            byte[] textBytes = text.getBytes(); // stringler byte olarak array a eklendi
            fileOutputStream.write(textBytes);

            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
