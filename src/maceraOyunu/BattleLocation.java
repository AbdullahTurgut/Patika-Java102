package maceraOyunu;

import java.util.Locale;
import java.util.Random;

public abstract class BattleLocation extends Location {

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız: " + this.getName());
        System.out.println("Dikkatli Ol! Burada "
                + obsNumber + " tane "
                + this.getObstacle().getName() + " yaşıyor !");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase = scanner.nextLine().toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {
            System.out.println(this.getName() + " tüm duşmanları yendiniz !");
            return true;
        }

        // <= çünkü 0 da olabilir player canı yinede ölmüş olmalı
        if (this.getPlayer().getHealthy() <= 0) {
            System.out.println("Öldünüz !");
            return false;
        }
        return true;
    }


    // savaş - kaç kısmı
    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            // ilk canavar öldükten sonra canı yenilemek için
            this.getObstacle().setHealth(this.getObstacle().getOrjinHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealthy() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = scanner.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdunuz !");
                    this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0; // bloklama hasardan fazlaysa - çıkmaması için
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealthy()) {
                System.out.println("Düşmanı yendiniz !");
                System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
                System.out.println();
            } else {
                return false;
            }
        }
        return true;
    }

    //canavara vurduktan sonra
    public void afterHit() {
        if (this.getPlayer().getHealthy() < 0) {
            this.getPlayer().setHealthy(0);
        }
        System.out.println("Canınız: " + this.getPlayer().getHealthy());
        if (this.getObstacle().getHealth() < 0) {
            this.getObstacle().setHealth(0);
        }
        System.out.println(this.getObstacle().getName() + " Canı: " + this.getObstacle().getHealth());
        System.out.println();
    }

    // savaş sırasında player özellikleri
    public void playerStats() {
        System.out.println("Oyuncu Değerleri");
        System.out.println("---------------------------");
        System.out.println("Sağlık: " + this.getPlayer().getHealthy());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Kaçınma: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para: " + this.getPlayer().getMoney());
        System.out.println();
    }

    // savaş sırasında canavar özellikleri
    public void obstacleStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri");
        System.out.println("---------------------------");
        System.out.println("Sağlık: " + this.getObstacle().getHealth());
        System.out.println("Hasar: " + this.getObstacle().getDamage());
        System.out.println("Ödül: " + this.getObstacle().getAward());
        System.out.println();
    }

    // random şekilde canavar sayısı üretmek için
    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;// 0 1 2 olabilir o yüzden 1 ekledik
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
