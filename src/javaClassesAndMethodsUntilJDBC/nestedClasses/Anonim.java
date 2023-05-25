package javaClassesAndMethodsUntilJDBC.nestedClasses;

public class Anonim {
    public int a = 10;
    public static void main(String[] args) {
        Anonim a = new Anonim(){
            public int a = 20; // bu kod bloğu ana sınıfdaki a yı 20 ile değiştirir.
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run methodu");
                print();
            }

            public void print(){
                System.out.println("Print methodu");
            }
        };
        a.run(); // print methodunu Override ettiğimiz run methodu içinde çağırabiliriz ama
//        a.print(); // bu şekilde çağıramayız çünkü override edilen method değil
    }

    public void run(){
        System.out.println("Anonim ana sınıfımız çalıştı");
    }
}
