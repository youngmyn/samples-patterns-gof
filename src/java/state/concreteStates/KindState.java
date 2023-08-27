package state.concreteStates;

import state.State;

public class KindState implements State {
    @Override
    public void speak() {
        System.out.println("I'm in a good mood and speak kindly");
    }
}
