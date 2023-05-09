package staticKodBlokları;

public class User {
    public String name;
    public static int counter = 0;

    // başında static yazarsak bir kere çalışır diğer türlü
    // her nesne üretildiğinde çalışır
    static {
        int random = (int) (Math.random() * 10);
        System.out.println("Random sayı : " + random);
        counter = random;
    }

    public User(String name) {
        this.name = name;
        counter++;
    }
}
