public class Player {
    public String name;
    public int id;

    public static int count = 22;
    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printName()
    {
        // static method içerisinde static olmayan nesne elemanını çağıramayız
        System.out.println(this.name); // burda static count kullanmak hata vermezdi ama yanlış kullanım olur
    }
}
