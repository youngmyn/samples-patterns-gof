package state;

import state.concreteStates.CalmState;

public class Human{
    private State state = new CalmState();
    private String name;

    public Human(String name) {
        this.name = name;
    }
    public void speak(){
        //may be some code
        System.out.print(name+":");
        state.speak();
    }

    public void setState(State state) {
        this.state = state;
    }
}
