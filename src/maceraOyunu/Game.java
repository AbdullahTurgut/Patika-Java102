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
            player.printInfo();
            System.out.println("Bölgeler");
            System.out.println("1 - Güvenli Ev --> Sağlık yenilenir.");
            System.out.println("2 - Mağaza     --> Ekipman satın alınır.");
            System.out.println("3 - Mağara     --> Ödül -> <Yemek>, zombi çıkabilir.");
            System.out.println("4 - Orman      --> Ödül -> <Odun>, vampir çıkabilir.");
            System.out.println("5 - Nehir      --> Ödül -> <Su>, ayı çıkabilir.");
            System.out.println("0 - Çıkış Yap  --> Oyunu sonlandır. ");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if(location == null){
                System.out.println("Bu zorlu savaştan çıkmayı seçtin !");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Oyun Bitti !");
                break;
            }
        }
    }
}
