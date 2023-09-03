package behavioral.state.concreteStates;

import behavioral.state.Human;
import behavioral.state.State;

public class DepletedState implements State {
    @Override
    public void runCross(Human human) {
        System.out.println("I'm trying to run, but I'm very tired ... I'm running out of strength ...");
    }
}
