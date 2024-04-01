import java.util.Arrays;
import java.util.Comparator;
public class Fight {
    protected int countOfSolidersFromTeam1;
    protected int countOfSolidersFromTeam2;
    protected Warrior[] warvars;
    protected Warrior[] opponents;
    public Fight(int countOfSolidersFromTeam1, int countOfSolidersFromTeam2) {
        this.countOfSolidersFromTeam1 = countOfSolidersFromTeam1;
        this.countOfSolidersFromTeam2 = countOfSolidersFromTeam2;

        Warrior[] warvars = new Warrior[countOfSolidersFromTeam1];
        Warrior[] opponents = new Warrior[countOfSolidersFromTeam2];

        for (int i = 0; i < countOfSolidersFromTeam1; i++) {
            warvars[i] = new Warrior(3, 14);
            System.out.println(warvars[i].person + "HP: " + warvars[i].hitPoints);
        }
        Arrays.sort(warvars, Comparator.comparing(Warrior::getInitiativity));
        for (int i = 0; i < countOfSolidersFromTeam2; i++) {
            opponents[i] = new Warrior(3, 14);
            System.out.println(opponents[i].person + "HP: " + opponents[i].hitPoints);
        }
        Arrays.sort(opponents, Comparator.comparing(Warrior::getInitiativity));
        this.warvars = warvars;
        this.opponents = opponents;
    }
    public String scene() {
        int actionsPerFight = countOfSolidersFromTeam1 + countOfSolidersFromTeam2;
        while (armyAlive(warvars) && armyAlive(opponents)) {
            for (int i = 1; i <= countOfSolidersFromTeam1; i++) {
                for (int j = 1; j <= countOfSolidersFromTeam2 && warvars[countOfSolidersFromTeam1 - i].person.isAlive; j++) {
                    if (opponents[countOfSolidersFromTeam2 - j].person.isAlive) {
                        opponents[countOfSolidersFromTeam2 - j].hitPoints = action(warvars[countOfSolidersFromTeam1 - i], opponents[countOfSolidersFromTeam2 - j]);
                        opponents[countOfSolidersFromTeam2 - j].person.isAlive = aliveControl(opponents[countOfSolidersFromTeam2 - j].hitPoints);
                        if (opponents[countOfSolidersFromTeam2 - j].person.isAlive) {
                            warvars[countOfSolidersFromTeam1 - i].hitPoints = action(opponents[countOfSolidersFromTeam2 - j], warvars[countOfSolidersFromTeam1 - i]);
                            warvars[countOfSolidersFromTeam1 - i].person.isAlive = aliveControl(warvars[countOfSolidersFromTeam1 - i].hitPoints);
                        }
                        break;
                    }
                }
            }
        }
        if (armyAlive(warvars))
            return "warwars win " + countAlive(opponents);
        else return "other team won " + countAlive(warvars);
    }

    private boolean aliveControl(int hp) {
        return hp > 0;
    }

    public int action(Warrior solider1, Warrior solider2) {
        int damage = solider1.damage();
        if (solider1.attack() > solider2.armorClass) {
            solider2.hitPoints-=damage;
            if (solider2.hitPoints <= 0) {
                solider2.hitPoints = 0;
                solider2.person.isAlive = false;
                System.out.println(solider1.person.name + " beat " + solider2.person.name + " and damaged him " + damage + ". " + solider2.person.name + " is dead:(");
            }
            else
                System.out.println(solider1.person.name + " beat " + solider2.person.name + " and damaged him " + damage + " HP = " + solider2.hitPoints);
        }
        return solider2.hitPoints;
    }
    public boolean armyAlive(Warrior[] army) {
        for (int i = 0; i < army.length; i++) {
            if (army[i].person.isAlive) return true;
        }
        return false;
    }
    public int countAlive(Warrior[] army) {
        int counter = 0;
        for (Warrior warrior : army) {
            if (warrior.person.isAlive) counter++;
        }
        return counter;
    }
}
