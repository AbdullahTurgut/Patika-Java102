package exceptions;

public class AgeCheckException extends Exception{

    public AgeCheckException(String message) {
        super(message);
        System.out.println("Yaş hatası alındı !");
    }

    @Override
    public String toString() {
        return "Bu AgeCheck sınıfına ait bir exception !";
    }
}
