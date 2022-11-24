public class Boss {
    public Boss(int hp, int dmg, String protection) {
        this.hp = hp;
        this.dmg = dmg;
        this.protection = protection;
    }

    private int hp;
    private int dmg;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    private String protection;

}
