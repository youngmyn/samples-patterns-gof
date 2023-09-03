package behavioral.memento;

import behavioral.memento.computerStuffing.File;
import behavioral.memento.computerStuffing.Program;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private String pcName;
    private List<File> files = new ArrayList<>();
    private List<Program> programs = new ArrayList<>();
    private int freeMemory = 500;

    public Computer(String pcName) {
        this.pcName = pcName;
    }
    public void addFile(File file){
        files.add(file);
        freeMemory-=file.getWeight();

    }
    public void addProgram(Program program){
        programs.add(program);
        freeMemory-=program.getWeight();
    }
    public Memento createMemento(){
        return new Memento(pcName,files,programs,freeMemory);
    }
    public void setMemento(Memento memento){
        this.pcName = memento.pcName;
        this.files = memento.files;
        this.programs = memento.programs;
        this.freeMemory = memento.freeMemory;
    }

    @Override
    public String toString() {
        return "Computer with" +
                "pcName='" + pcName + '\'' +
                " with "+programs.size()+" programs"+
                " and "+ files.size() +" files"+
                ", free memory size: " + freeMemory;
    }

    public class Memento{
        private String pcName;
        private List<File> files;
        private List<Program> programs;
        private int freeMemory;

        private Memento(String pcName, List<File> files, List<Program> programs, int freeMemory) {
            this.pcName = pcName;
            this.files = new ArrayList<>(files);
            this.programs = new ArrayList<>(programs);
            this.freeMemory = freeMemory;
        }
    }
}
