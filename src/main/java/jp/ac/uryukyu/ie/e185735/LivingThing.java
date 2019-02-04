package jp.ac.uryukyu.ie.e185735;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    boolean isDead() {
        return dead;
    }

    String getName() {
        return name;
    }

    void deadSetter(boolean dead) {
        this.dead = dead;
    }

    void hitpointSetter(int hitpoint) {
        this.hitPoint -= hitpoint;
    }

    int hitpointGetter() {
        return hitPoint;
    }

    String nameGetter() {
        return name;
    }

    public void attack(LivingThing opponent) {
        if (this.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }


    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
