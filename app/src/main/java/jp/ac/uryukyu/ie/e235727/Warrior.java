package jp.ac.uryukyu.ie.e235727;

public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        if( getHitPoint() > 0 ){
            int damage = (int)(getAttack()* 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }else{
            int noDamage = 0;
            System.out.println("モンスターは死亡によりダメージが与えられなかった！！");
            opponent.wounded(noDamage);
        }
    }


}


    

