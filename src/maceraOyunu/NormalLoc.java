package maceraOyunu;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        // bu konumlarda ölme imkanı yok true döndüreceğiz
        return true;
    }
}
