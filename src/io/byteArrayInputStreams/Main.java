package io.byteArrayInputStreams;


import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // bir array ve içinde byte verileri olsun bunları okumaya yarıyan ByteArrayInputStream

        byte[] dizi = {1, 2, 3, 54, 66, 4, 12, 15, 5};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi); // try catch istemiyor bizden
        //2. constructor kullanımı
        ByteArrayInputStream input2 = new ByteArrayInputStream(dizi, 2,5 );//2.indisle beraber 5 tane


        int i = input2.read();
        while (i != -1) {
            System.out.println(i);
            i = input2.read();
        }

        try {
            input2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
