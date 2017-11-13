package jp.ac.uryukyu.ie.e175751;

public class LivingThing {
     String name;
     int hitPoint;
     int attack;
     boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    public boolean isDead() {
        return dead;
    }


    public String getName(){
        return name;
    }
    /*

    public void setName(String name){
        this.name=name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack=attack;
    }

    public boolean getIsdead(){
        return dead;
    }

    public void setIsdead(boolean dead){
        this.dead=dead;
    }
    */
    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(LivingThing opponent) {

        if (isDead() == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
    }

}
