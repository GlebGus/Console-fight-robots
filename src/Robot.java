public class Robot extends Abstractrobot {
    private final String name;
    private int hp;
    private final int damage;
    private final int criticalStrike;
    private final int criticalStrikeChance;


    public Robot(String name, int hp, int damage, int criticalStrike, int criticalStrikeChance) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.criticalStrike = criticalStrike;
        this.criticalStrikeChance = criticalStrikeChance;
    }

    public String getName() {
        return name;
    }public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return hp;
    }
    public int getDamage(){
        return damage;
    }
    public int getCriticalStrike(){
        return criticalStrike;
    }
    public int getCriticalStrikeChance(){
        return criticalStrikeChance;
    }
}