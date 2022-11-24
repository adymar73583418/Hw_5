public class Hero {
    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public String getSuperpower() {
        return superpower;
    }

    private int hp;

    public Hero(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    private int dmg;

    public Hero(int hp, int dmg, String superpower) {
        this.hp = hp;
        this.dmg = dmg;
        this.superpower = superpower;
    }

    private String superpower;
}
