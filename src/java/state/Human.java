package state;

import state.concreteStates.CheerfulState;

public class Human{
    private State state = new CheerfulState();
    private String name;

    public Human(String name) {
        this.name = name;
    }
    public void runCross(){
        //may be some code
        System.out.print(name+":");
        state.runCross(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
