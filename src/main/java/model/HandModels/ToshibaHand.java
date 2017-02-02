package model.HandModels;

import interfaces.Hand;

/**
 * Created by Sergej on 02.02.2017.
 *
 * ToshibaHand for robot
 */
public class ToshibaHand implements Hand {

    @Override
    public void catchSmth() {
    System.out.print("I catch smth");
    }
}
