package jp.ac.uryukyu.ie.e175751;


public class Enemy extends LivingThing {



    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    //int hp=getHitPoint();
    //String na=getName();
    //boolean de=getIsdead();

    @Override
    public void wounded(int damage){

        String na=getName();

        hitPoint -= damage;

        if( hitPoint < 0 ) {
            dead = true;

            System.out.printf("モンスター%sは倒れた。\n", na);
        }
    }

}
