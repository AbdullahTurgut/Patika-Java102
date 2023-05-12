package maceraOyunu;

import java.util.Scanner;

public class Player {

    private int damage;
    private int healthy;
    private int money;
    private String charName;
    private String name; // İsmi dışarıdan alıcaz diğerleri constructorda gerek yok
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;


    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameCharacter[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("---------------------------------------------------------------------");
        for (GameCharacter gameChar : charList) {
            System.out.println(gameChar.toString());
//            System.out.println(
//                    "Karakter: " + gameChar.getName()
//                    + "\tHasar: " + gameChar.getDamage()
//                    + "\tSağlık: " +gameChar.getHealth()
//                    + "\tPara: " + gameChar.getMoney()
//            );
        }
        System.out.print("Lütfen bir karakter seçiniz: ");
        int selectChar = scanner.nextInt();
        switch (selectChar) {
            case 1:
                // seçilen karakter özellikleri aktarılacak
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealthy(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getName());
    }

    public void printInfo() {
        System.out.println("Silahınız: " + this.getInventory().getWeapon().getName()
                + "\tZırhınız: " + this.getInventory().getArmor().getName()
                + "\tBloklama: " + this.getInventory().getArmor().getBlock()
                + "\tHasarınız: " + this.getTotalDamage()
                + "\tSağlığınız: " + this.getHealthy()
                + "\tParanız: " + this.getMoney()
        );
    }


    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
