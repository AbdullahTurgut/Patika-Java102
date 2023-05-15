package exceptions;

import java.util.Scanner;

public class ThrowMain {

    public static void checkAge(int age) throws AgeCheckException {
        if(age < 18){
            throw new AgeCheckException("Yaşınız tutmuyor");
        }

        System.out.println("Yaşı uygundur !");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        try {
        checkAge(age);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }
        System.out.println("Program bitti");
    }
}
