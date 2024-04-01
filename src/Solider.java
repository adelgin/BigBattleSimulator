import java.util.Random;

abstract class Solider {
    Person person;
    protected int hitPoints;        //количество хп
    protected int armorClass;       //класс доспеха
    protected int strength;         //сила
    protected int dexterity;        //ловкость
    protected int constitution;     //телосложение
    protected int intelligence;     //интелект
    protected int charisma;         //харизма
    protected int wisdom;           //мудрость
    protected int level;        //по умолчанию уровень третий, при желании можно изменить
    protected int hitPerLvl;
    protected int initiativity;
    public Solider() {
        person = new PersonFabric();
        strength = statsGenerator();
        dexterity = statsGenerator();
        constitution = statsGenerator();
        intelligence = statsGenerator();
        charisma = statsGenerator();
        wisdom = statsGenerator();
        armorClass = 11 + (constitution-11);
        initiativity = initiativityGenerator();
        hitPoints = hpGenerator();
    }
    public int statsGenerator() {
        Random random = new Random();
        return (random.nextInt(6) + random.nextInt(6) + random.nextInt(6));
    }
    public int initiativityGenerator() {
        Random random = new Random();
        return (random.nextInt(20));
    }
    public int hpGenerator() {
        Random random = new Random();
        hitPoints = hitPerLvl - 1;
        for (int i = 0; i < level; i++) {
            hitPoints += random.nextInt(hitPerLvl);// + (constitution-11);
        }
        return hitPoints;
    }
    public int hpLevelUp() {
        Random random = new Random();
        return random.nextInt(hitPerLvl);// + (constitution-11));
    }
    public int getInitiativity() {
        return initiativity;
    }
}
