package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2016/11/24.
 */
/**
 * EnemyクラスはLivingThingクラスを継承している。
 * name, maximumHP, attackが継承されている。
 */
public class Enemy extends LivingThing {
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * Enemyが死亡した場合、出力される。
     */
    public void information(){
        System.out.printf("モンスター%sは倒れた。　\n", getName());
    }
}
