package Inheritance;

// extends ile Akademisyen sınıfını Calisan sınıfının alt sınıfı yaptık!
// Calisan sınıfının method ve değişkenleri buraya kalıtıldı.
public class Akademisyen extends Calisan {

    private String bolum;
    private String unvan;

    // kalıtım alındığı için Calisan sınıfının Constructor'ını yazmak zorundayız
    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giriş yaptı!!"); // getterdan yararlanarak çağırdık(Calisan sınıfından)
    }
}
