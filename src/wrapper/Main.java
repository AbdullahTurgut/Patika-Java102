package wrapper;

public class Main {
    public static void main(String[] args) {

        // ---Boxing
        // ---Unboxing
        int a = 10;
        //Autoboxing işlemi
        Integer b = a;
        //Boxing
        Integer c = Integer.valueOf(a);// bu artık gereksiz bir işlem
        // AutoUnboxing
        int d = c;
        //Unboxing
        int i = c.intValue(); // bu artık gereksiz bir işlem

        // Wrapper sınıflar
        // Wrapper sınıfları ileride generic ve collection yapılar için önem arz edecek
//        String a = "10";
//        int c = Integer.parseInt(a);
//        int b = 20;
//        System.out.println(c + b);

//        System.out.println(a + b);// 1020 yazdırır
    }
}
