package javaClassesAndMethodsUntilJDBC.methodOverRiding;

public class Main {
    public static void main(String[] args) {
        ExampleInheritance exampleInheritance = new ExampleInheritance();
        exampleInheritance.giris(); // parametresiz method çalışır
        exampleInheritance.giris("Parametreli"); // Overriding method çalışır tek parametreli
        exampleInheritance.giris("Abdullah",27); // çift parametreli method çalışır
    }
}
