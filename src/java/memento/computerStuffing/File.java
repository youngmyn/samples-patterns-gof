package memento.computerStuffing;

public class File {
    private String content;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public File(String content) {
        this.content = content;
        weight = content.length();
    }
}