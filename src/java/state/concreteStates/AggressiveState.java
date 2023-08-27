package state.concreteStates;

import state.State;

public class AggressiveState implements State {
    @Override
    public void speak() {
        System.out.println("I'm angry and speak aggressively");
    }
}
