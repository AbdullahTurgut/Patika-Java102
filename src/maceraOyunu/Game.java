package maceraOyunu;


import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Macera oyununa hoşgeldiniz!");
//        System.out.print("Lütfen bir isim giriniz: ");
//        String playerName = scanner.next();
        Player player = new Player("Abdullah");
        System.out.println("Hoşgeldin " + player.getName());
        System.out.println("Lütfen bir karakter seçiniz");
        player.selectChar();
        Location location = null;

        while (true) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Bölgeler");
            System.out.println("1 - Güvenli Ev --> Sağlık yenilenir.");
            System.out.println("2 - Mağaza     --> Ekipman satın alınır.");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (!location.onLocation()) {
                System.out.println("Oyun Bitti !");
                break;
            }
        }
    }
}
