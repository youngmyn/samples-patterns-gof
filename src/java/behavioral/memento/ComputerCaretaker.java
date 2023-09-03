package behavioral.memento;

import behavioral.memento.computerStuffing.File;
import behavioral.memento.computerStuffing.Program;

import java.util.Stack;

public class ComputerCaretaker {
    private Computer computer;
    private Stack<Computer.Memento> history = new Stack<>();
    public ComputerCaretaker(Computer computer) {
        this.computer = computer;
    }
    public void saveFile(File file){
        if(file==null||file.getWeight()==0) return;
        history.push(computer.createMemento());
        computer.addFile(file);
    }
    public void installProgram(Program program){
        if(program==null||program.getWeight()==0||program.getFileExtension().equals("virus")) return;
        history.push(computer.createMemento());
        computer.addProgram(program);
    }
    public void undo(){
        Computer.Memento memento = history.pop();
        if(memento==null) throw new RuntimeException();
        System.out.println("undo last operation...");
        computer.setMemento(memento);
    }
    public void printComputerStatus(){
        System.out.println(computer);
    }
}
