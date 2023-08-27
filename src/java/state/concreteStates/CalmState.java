package state.concreteStates;

import state.State;

public class CalmState implements State {
    @Override
    public void speak() {
        System.out.println("I am now extremely calm and speak neutrally");
    }
}
