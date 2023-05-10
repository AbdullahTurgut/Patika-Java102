package Inheritance;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    // Ogretim gorevlisi Akademisyen üzerinde Calisan sınıfının da bir kalıtımına sahiptir.
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " öğretim görevlisi derse giriş yaptı!!");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " öğretim görevlisi B kapısından giriş yaptı!!");
    }
}