package maceraOyunu;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz !");
        boolean showMenu = true;
        while (showMenu) {
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
                    printWeapons(); // silahlar listelendi
                    buyWeapon(); // satın alım işlemi
                    break;
                case 2:
                    printArmors(); // zırhlar listelendi
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Mağazadan çıkış yaptın !");
                    showMenu = false;
                    break;
            }
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
        System.out.println("0 - Çıkış Yap !");
    }

    private void buyWeapon() {
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer , tekrar giriniz: ");
            selectWeaponID = scanner.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                } else {
                    // satın alma gerçekleşti
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon); // seçtiğimiz silahı takmak için
                }
            }
        }

    }

    //zırhları bastır
    public void printArmors() {
        System.out.println("---Zırhlar---");
        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getId() + "- "
                    + armor.getName()
                    + " <Fiyat: " + armor.getPrice()
                    + "  Zırh: " + armor.getBlock() + ">");
        }
        System.out.println("0 - Çıkış Yap !");
    }

    // zırh satın alma
    public void buyArmor() {
        System.out.print("Bir zırh seçiniz: ");
        int selectArmorID = scanner.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Geçersiz değer , tekrar giriniz: ");
            selectArmorID = scanner.nextInt();
        }
        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                } else {
                    // satın alma gerçekleşti
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız !");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor); // seçtiğimiz armoru takmak için
                }
            }
        }
    }
}
