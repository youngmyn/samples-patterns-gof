package state.concreteStates;

import state.Human;
import state.State;

public class CheerfulState implements State {
    @Override
    public void runCross(Human human) {
        System.out.println("Running cross cheerfully!");
        try {
            Thread.sleep(5000);
            human.setState(new TiredState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
