package nestedClasses;

public class Main {
    public static void main(String[] args) {
        // Nested Class (İç içe sınıflar)
        // - Inner Class ( İç sınıflar )
        //      - static
        //      - non-static
        // - Local Class( Yerel Sınıflar)
        // - Anonymus Class ( Anonim Sınıflar )

//        Out o = new Out();
//        o.run();

//        Out o = new Out();// dış sınıf
//        Out.In in = o.new In();  // iç sınıf
//        Out.In in = o.getIn(); // bir üstteki satır ile aynı
//        in.run();


        Out.In.run(); // static sınıfı ve methodu nesne üretmeden çağırdık
    }
}
