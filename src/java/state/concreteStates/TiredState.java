package state.concreteStates;

import state.Human;
import state.State;

public class TiredState implements State {
    @Override
    public void runCross(Human human) {
        System.out.println("Running cross...but feeling tired");
        try {
            Thread.sleep(5000);
            human.setState(new DepletedState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
