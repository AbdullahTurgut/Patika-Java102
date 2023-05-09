package Inheritance;

public class Main {
    // Kalıtım (Inheritance)
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Abdullah Turgut", "05330416452", "abdullah@gmail.com");
        Akademisyen a1 = new Akademisyen("Eray Turgut", "0532345343", "eray@gmail.com", "CENG", "Doçent");
//        c1.giris();
//        a1.yemekhane();//method Calisan sınıfına ait olmasına rağmen Akadamisyen sınıfından erişebiliriz(Kalıtım)
//        a1.giris();

        Memur m1 = new Memur("Asya Turgut", "051231234", "asya@gmail.com", "IT", "9-6");
//        m1.giris(); // Calisan sınıfı methodu
//        m1.calis(); // Kendi sınıfı methodu

        OgretimGorevlisi o1 = new OgretimGorevlisi("M T", "05123123", "mt@patika.dev", "CENG", "Doçent", "110");
//        o1.giris(); // Calisan sınıfı methodu
//        o1.derseGir(); // Akademisyen sınıfı methodu
//        System.out.println(o1.getKapiNo()); // OgretimGrevlisi sınıfı methodu
    }
}
