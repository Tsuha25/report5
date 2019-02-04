package jp.ac.uryukyu.ie.e185735;

public class Enemy extends LivingThing {
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    @Override
    public void wounded(int damage) {
        hitpointSetter(damage);
        if (hitpointGetter() < 0) {
            deadSetter(true);
            System.out.printf("モンスター%sは倒れた。\n", nameGetter());
        }
    }
}