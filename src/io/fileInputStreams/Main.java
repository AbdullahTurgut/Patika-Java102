package io.fileInputStreams;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        // hali hazırda olan bir dosyayı okumak için
        try {
//            File dosya = new File("src/io/fileInputStreams/patika.txt"); // var olduğu için
//            FileInputStream inputStream = new FileInputStream(dosya); // burda direk içine atabildik
            FileInputStream inputStream = new FileInputStream("src/io/fileInputStreams/patika.txt");
//            System.out.println(inputStream.read()); // P'nin byte değerini döndürür
//            System.out.println(inputStream.read()); // 2. eleman 'a' nın byte değerini döndürür boş ise içerik -1

            // --- available() -> dosya içinde ki karakter saysını veriri
            System.out.println("Kullanılabilir byte(karakter) sayısı : " + inputStream.available());

            // ---- skip(parameter) -> parametre verilen sayı kadar içerik atlar
            inputStream.skip(10); // örneğin 10 karakter atladı ve çıktıya oyle başladı
            int i = inputStream.read(); // i ye 88 i atadı
            while(i != -1){
                System.out.print((char) i);
                i = inputStream.read();
            }
            // read ile okundukca byte sayısı düşer
            System.out.println("Kullanılabilir byte(karakter) sayısı : " + inputStream.available());
            inputStream.close(); // işimiz bittiğinde kapatmalıyız
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
