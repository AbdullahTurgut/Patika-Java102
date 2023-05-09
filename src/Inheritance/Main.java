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

        // Override methods
//        o1.giris();
//        a1.giris();
//        c1.giris();
//        m1.giris();

        // Polimorfizm ( Çok Biçimlilik )
//        Calisan a2= new Akademisyen("Kodluyoruz","0532345343", "eray@gmail.com", "CENG", "Doçent");
        // Burda önemli olan a2 nin Override edilmiş methodlara erişebilir fakat diğerlerine erişemez
//        a2.giris(); // Calisan sınıfı fakat Akademisyen gibi davranan a2 Akademisyen sınıfı giris methodunu çağırır

//        int[] loginUser = new int[5];
        Calisan[] loginUser = {c1, a1, m1, o1}; // hepsi Calisan sınıfından türetildiği için hata vermedi
        Calisan.girisYapanlar(loginUser);
    }
}
