package hw1.mykhaylo_osadtsiv.recursion;

import hw1.mykhaylo_osadtsiv.aggregation.Person;

public class Ninja extends Person {
    private final int maxHP;
    private final int damage;
    private int curHP;
    private Ninja enemy;

    public Ninja(String name) {
        super(name);
        this.maxHP = 100;
        this.damage = 10;
        this.curHP = getMaxHP();
    }

    public int getDamage() {
        return damage;
    }


    public int getCurHP() {
        return curHP;
    }

    public void setCurHP(int curHP) {
        this.curHP = curHP;
    }

    public Ninja getEnemy() {
        return enemy;
    }

    public void setEnemy(Ninja enemy) {
        this.enemy = enemy;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void hit() {
        this.getEnemy().setCurHP(this.getEnemy().getCurHP() - this.getDamage());
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "Name=" + super.getName() +
                ", curHP=" + this.getCurHP() +
                '}';
    }
}
