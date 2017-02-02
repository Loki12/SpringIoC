package model.RobotModels;

import interfaces.Hand;
import interfaces.Robot;

/**
 * Created by Sergej on 02.02.2017.
 *
 * This is Robot class.
 */
public class ModelT1000 implements Robot {

    private String name;
    private Hand hand;

    public ModelT1000(String name, Hand hand) {
        this.hand = hand;
        this.name = name;
    }

    @Override
    public void fire() {
        hand.catchSmth();
    }

    @Override
    public void dance() {
        System.out.print("I'm dancing" + name);
    }
}
