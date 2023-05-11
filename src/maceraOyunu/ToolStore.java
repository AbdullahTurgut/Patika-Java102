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

        while (selectCase < 1 || selectCase > 3) {
            System.out.print("Geçersiz değer , tekrar giriniz: ");
            selectCase = scanner.nextInt(); // ata sınıftan geldiği için Location. yazmamıza gerek kalmaz
        }

        switch (selectCase) {
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

    public void printWeapons() {
        System.out.println("---Silahlar---");
        for (Weapon weapon : Weapon.weapons()) { // static olduğu için nesne üretmeden silah listesini aldık
            System.out.println(weapon.getId() + "- " + weapon.getName()
                    + " <Para: " + weapon.getPrice()
                    + "  Hasar: " + weapon.getDamage() + ">");
        }
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer , tekrar giriniz: ");
            selectWeaponID = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponID);

        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Yeterli paranız bulunmamaktadır !");
            } else {
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız !");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
            }
        }
    }

    public void printArmors() {
        System.out.println("---Zırhlar---");
    }
}
