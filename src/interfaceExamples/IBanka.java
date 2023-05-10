package interfaceExamples;

public interface IBanka {
    // değişken interface içinde varsayılan bir değer olmadan tanımlayamayız
    final String hostIpAddres = "127.0.0.1";

    // abstract benzeri bir yapı
    boolean connect(String ipAddress);

    boolean payment(Double price,String cardNumber, String date, String cvc);
}
