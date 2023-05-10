package maceraOyunu;


import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz!");
//        System.out.print("Lütfen bir isim giriniz: ");
//        String playerName = scanner.next();
        Player player = new Player("Abdullah");
        System.out.println("Hoşgeldin " + player.getName());
        System.out.println("Lütfen bir karakter seçiniz");
        player.selectChar();
    }
}
