package io.serializationExamples;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        // objectoutputstream ******* objectinputstream -> nesne okuma işlemleri

        Car c1 = new Car("Audi", "A3"); // bu nesneyi bir txt dosyasında saklayabiliyoruz artık

        try {
            // dosyayı oluştur ve nesneyi dosyaya yazz
            FileOutputStream outputFile = new FileOutputStream("src/io/serializationExamples/araba.txt");
            ObjectOutputStream write = new ObjectOutputStream(outputFile); // dosyaya aktarılması gerekiyor
            write.writeObject(c1);

            // Nesneyi okumak
            FileInputStream fileIn = new FileInputStream("src/io/serializationExamples/araba.txt");
            ObjectInputStream read = new ObjectInputStream(fileIn);
            // Dosya içindeki objeyi oku
            Car car2 = (Car) read.readObject(); // tip dönüşümü ister
            System.out.println(car2.getBrand());
            System.out.println(car2.getModel());

            read.close();
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
