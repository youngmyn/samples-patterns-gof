package behavioral.command.concreteCommands;

import behavioral.command.Command;
import behavioral.command.Computer;

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
