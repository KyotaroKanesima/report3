package jp.ac.uryukyu.ie.e235727;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int maximumHP, int attack){
        this.setName(name);
        this.setHitPoint(maximumHP);
        this.setAttack(attack);
        this.setDead(false);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public void attack(LivingThing opponent){
        if( this.hitPoint > 0 ){
            int damage = (int)(Math.random() * this.attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }else{
            int noDamage = 0;
            System.out.println("モンスターは死亡によりダメージが与えられなかった！！");
            opponent.wounded(noDamage);
        }
    }
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    /**
     * setter method
     * @param name
     * @param not{@code null}
     */
    public void setName(String name){this.name = name;}
    /**
     * setter method
     * @param hitPoint
     * @param not{@code null}
     */
    public void setHitPoint(int hitPoint){this.hitPoint = hitPoint;}
    /**
     * setter method
     * @param attack
     */
    public void setAttack(int attack){this.attack = attack;}
    /**
     * setter method
     * @param dead
     */
    public void setDead(boolean dead){this.dead = dead;}
    /**
     * getter method
     * @return String
     */
    public String getName(){
        return this.name; 
    }
    /**
     * getter method
     * @return boolean
     */
    public boolean isDead(){
        return this.dead; 
    }
    /**
     * getter method
     * @return int
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * getter method
     * @return int
     */
    public int getAttack(){
        return this.attack;
    }


    
}
