package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void connectTCMB(){
        // .....
        System.out.println("Merkez Bankasının kurlarına erişiliyor");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = 10;
        try {
            int a = scanner.nextInt(); // string girilme durumunda
            System.out.println(b / a); // Exception in thread "main" java.util.InputMismatchException hatası verir
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException hatası alındıa");
        }
    }
}
