package behavioral.memento.computerStuffing;

public class Program {
    private String name;
    private String fileExtension;
    private int weight;
    public Program(String name, String fileExtension, int weight) {
        this.name = name;
        this.fileExtension = fileExtension;
        this.weight = weight;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public int getWeight() {
        return weight;
    }

}
