package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2016/11/24.
 */
/**
 * HeroクラスはLivingThingクラスを継承している。
 * name, maximumHP, attackが継承されている。
 */
public class Hero extends LivingThing {
    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * Heroが死亡した場合、出力される。
     */
    public void information(){
        System.out.printf("勇者%sは道半ばで力尽きてしまった。　\n", getName());
    }
}
