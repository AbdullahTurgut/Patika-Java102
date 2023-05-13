package nestedClasses;

public class Out {

    public int a = 5;

    // inner class
    public static class In {
        public static int a = 10;

        // in sınıfına ait run methodu
        public static void run() {
            // iç sınıf dış sınıfa sınıfAdı.this veya this ile ulaşabilir
            System.out.println("In sınıfına ait run methodu çalıştı");
            int a = 1;
            System.out.println(a); // 1 bastırır
            System.out.println(In.a); // 10 yazdırır
//            System.out.println(this.a); // 10 bastırır
//            System.out.println(Out.this.a); // bir dış sınıf var ise ona ulaşmak için // 5
        }
    }

    // out sınıfına ait run methodu
    public void run() {
        // dış içtekine ulaşmak için nesne üretmesi gerekir
//        In in = new In();
//        in.run();
        In.run();
    }

//    public In getIn(){
//        In in = new In();
//        return in;
//    }
}
