package Inheritance;

// extends ile Akademisyen sınıfını Calisan sınıfının alt sınıfı yaptık!
// Calisan sınıfının method ve değişkenleri buraya kalıtıldı.
public abstract class Akademisyen extends Calisan {

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

    public abstract void derseGir();

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " akademisyeni A kapısından giriş yaptı!!");
    }
}
