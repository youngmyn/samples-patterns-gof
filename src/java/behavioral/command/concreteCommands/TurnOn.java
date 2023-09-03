package behavioral.command.concreteCommands;

import behavioral.command.Command;
import behavioral.command.Computer;

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
