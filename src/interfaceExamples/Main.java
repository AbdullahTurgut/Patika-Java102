package interfaceExamples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = scanner.nextDouble();

        System.out.print("Kart no girniiz: ");
        String cardNumber = scanner.next();

        System.out.print("Son kullanım tarihi giriniz : ");
        String date = scanner.next();

        System.out.print("Güvenlik kodu giriniz : ");
        String cvc = scanner.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka seçiniz : ");
        int selectBank = scanner.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankasi", "1233415123123", "123123");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankasi", "1233415123123", "123123");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, date, cvc);
            default:
                System.out.println("Geçerli banka giriniz!");
        }

    }

}
