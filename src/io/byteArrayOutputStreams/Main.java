package io.byteArrayOutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String data = "Java 102 Dersleri!";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] dataByteArray = data.getBytes();

        try {
            outputStream.write(dataByteArray);
            String newData = outputStream.toString();
            System.out.println("Çıkış Akışı : " + newData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
