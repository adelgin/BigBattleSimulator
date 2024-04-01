import java.util.Random;

public class Warrior extends Solider {
    Random random = new Random();
    protected int MaxDamage = 6;
    public Warrior(int level, int armorClass) {
        hitPerLvl = 8;
        this.level = level;
        this.hitPoints = hpGenerator();
        this.armorClass = armorClass + (random.nextInt(-2, 2));
    }
    public int attack() {
        return (random.nextInt(1, 20));
    }
    public int damage() {
        return (random.nextInt(1, 6));
    }

}
