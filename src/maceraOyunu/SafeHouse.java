package maceraOyunu;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Canınız yenilendi !");
        this.getPlayer().setHealthy(this.getPlayer().getOrjinalHealthy());
        return true;
    }
}
