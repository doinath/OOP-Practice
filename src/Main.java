import java.util.*;

interface attack {

    int basic_attack(int damage);
    int skill(String skillName, int damage);
}

interface state {
    boolean isAlive();
}




abstract class Character {
    public String name;
    public int hitPoints;
    public int manaPoints;

    /*public Character(String name, int hitPoints, int manaPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.manaPoints = manaPoints;
    }*/

}

class Hakobe extends Character implements attack {
    private final String name;
    private int hitPoints;
    private int manaPoints;

    public Hakobe() {
        name = "Hakobe";
        hitPoints = 100;
        manaPoints = 100;
        //super("Hakobe", 100, 100);

    }

    @Override
    public int basic_attack(int damage) {
        System.out.println("Attacks with "+ damage+ " total damage");

        return damage;
    }

    @Override
    public int skill(String skillName, int damage) {

        return damage;
    }
}

class Boss extends Character implements attack {
    private final String name;
    private int hitPoints;
    private int manaPoints;

    public Boss() {
        //super("Boss", 100, 100);
        name = "Boss";
        hitPoints = 100;
        manaPoints = 100;
    }

    public boolean takenDamage(int damage) {
        return damage > 0;
    }

    public String getName() {
        return name;
    }
    public void bossHealth(int damage) {
        if(takenDamage(damage)) {
            System.out.println(getName() + " has taken " + damage + " damage");
            this.hitPoints -= damage;
        }
    }

    @Override
    public int basic_attack(int damage) {
        System.out.println("Attacks with "+ damage+ " total damage");

        return damage;
    }

    @Override
    public int skill(String skillName, int damage) {
        return 1;
    }
}
public class Main {
    public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);

    //Character c = new Character();

    Hakobe h = new Hakobe();
    Boss b = new Boss();

    b.bossHealth(h.basic_attack(100));

    }
}