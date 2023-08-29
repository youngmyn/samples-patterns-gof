package state.concreteStates;

import state.Human;
import state.State;

public class DepletedState implements State {
    @Override
    public void runCross(Human human) {
        System.out.println("I'm trying to run, but I'm very tired ... I'm running out of strength ...");
    }
}
