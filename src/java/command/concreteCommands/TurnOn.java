package command.concreteCommands;

import command.Command;
import command.Computer;

public class TurnOn implements Command {
    private Computer computer;

    public TurnOn(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOn();
    }

    @Override
    public void undo() {
        computer.turnOff();
    }
}
