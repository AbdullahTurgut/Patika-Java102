package javaClassesAndMethodsUntilJDBC.FinalKeyWord;

public class Daire {
    public int r ;
    public final double PI = 3.14;

    public Daire(int r) {
        this.r = r;
    }

    public void calcArea(){
        double area = PI * this.r * this.r;
        System.out.println("Dairenin alanı : " + area);
    }
}
