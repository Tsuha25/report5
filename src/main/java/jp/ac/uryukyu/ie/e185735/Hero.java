package jp.ac.uryukyu.ie.e185735;

public class Hero extends LivingThing {
    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    @Override
    public void wounded(int damage) {
        hitpointSetter(damage);
        if (hitpointGetter() < 0) {
            deadSetter(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", nameGetter());
        }
    }
}
