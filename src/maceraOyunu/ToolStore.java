package maceraOyunu;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz !");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış Yap");
        System.out.print("Seçiminiz: ");
        int selectCase = Location.scanner.nextInt(); // static->artık her nesne üretildiğinde üretilmeyecek

        while (selectCase < 1 || selectCase > 3){
            System.out.print("Geçersiz değer , tekrar giriniz: ");
            selectCase = scanner.nextInt(); // ata sınıftan geldiği için Location. yazmamıza gerek kalmaz
        }

        switch (selectCase){
            case 1:
                printWeapons();
                break;
            case 2:
                printArmors();
                break;
            case 3:
                System.out.println("Mağazadan çıkış yaptın !");
                return true;

        }
        return true;
    }

    public void printWeapons(){
        System.out.println("---Silahlar---");

    }

    public void printArmors(){
        System.out.println("---Zırhlar---");
    }
}
