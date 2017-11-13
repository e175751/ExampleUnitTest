package jp.ac.uryukyu.ie.e175751;


public class Hero extends LivingThing {


    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);

    }

    //int hp=getHitPoint();
    //String na=getName();
    //Boolean de=getIsdead();

    @Override
    public void wounded(int damage){

        String na=getName();

        hitPoint -= damage;

        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", na);
        }
    }
}
