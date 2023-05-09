package FinalKeyWord;

public class Main {
    public static void main(String[] args) {
        Daire daire = new Daire(10);
//        daire.PI = 10; // bu yanlış pi değiştirilememesi için 'final' tanımlayacağız
        daire.calcArea();
    }
}
