package io;

// File sınıfı java.io File sınıfı

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // byte streams
        // character streams
//        File dosya = new File("src/io/patika.txt");

        //dosya yoksa oluşturmak için
//        try {
//            if(dosya.createNewFile()){
//                System.out.println(dosya.getName() + " dosyası oluşturuldu.");
//            }else {
//                System.out.println(dosya.getName() + " dosyası zaten mevcut");
//            }
////            dosya.createNewFile(); // 2 yol ya methodu throws IOException ile sarmala yada try catch blokları
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // dosyayı silmek için
//        dosya.delete(); // dosya varsa siler true / yoksa false döndürür

        // olmayan bir dizin ve dosya oluşturmak için mkdir() -> boolean  ve mkdirs() -> dizin oluşturur
//        File file = new File("src/CreatedTestDirectory/test.txt");
//        System.out.println(file.mkdir()); // şuan dizin yok false döner
//        System.out.println(file.mkdirs()); // olmayan dizin oluşturulur ve true döner
//        file.delete();

        // dizindeki elemanları listeleme list()-> String[]
        File file = new File("src/io/listingTestDirectory");
        String[] strs = file.list(); // string dizisine atama yapıldı list() ile

        for(String str : strs){
            System.out.println(str);
        }

    }
}
