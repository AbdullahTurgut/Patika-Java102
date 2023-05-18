package collections.mapAndHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> country = new HashMap<>();

        country.put("TR","Türkiye");
        country.put("TR","TürkiyeYeni"); // set işlemi bu şekilde yapılabilir
        country.put("GR","Almanya");
        country.put("EN","İngiltere");
        country.put("USA","Amerika");

//        country.remove("EN"); // remove ile EN anahtarlı veriyi sildik
//        System.out.println(country.get("EN")); // bu şekilde null döndü
//        System.out.println(country.size());
//        System.out.println(country.get("TR")); // key ile değeri döndürdük
        // Not-> maplere özel iterator yok forEach ile gezebiliyoruz
        for (String countryKey : country.keySet()){
//            System.out.println(country.get(countryKey)); // buda verileri görmek için bi yöntem
            System.out.println(countryKey); // burda bi sıralama mantığı yok
        }
        System.out.println("---------------------------------------");
        for (String countryValue: country.values()){
            System.out.println(countryValue); // burda keylerin sırası ile değerleri verdiğini görüyoruz
        }



    }
}
