public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(20,20,"защитный барьер");
        Hero spiderMan = new Hero(359,50);
        Boss boss = new Boss(430,100,"отталкивающий");
        System.out.println(boss.getDmg() + boss.getHp() + hero.getDmg() + hero.getHp() +
                spiderMan.getHp()+ spiderMan.getDmg());

    }
}