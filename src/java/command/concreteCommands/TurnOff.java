package command.concreteCommands;

import command.Command;
import command.Computer;

public class TurnOff implements Command {
    private Computer computer;

    public TurnOff(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOff();
    }

    @Override
    public void undo() {
        computer.turnOn();
    }
}
