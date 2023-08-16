package command;
//RECEIVER
public class Computer {
    private String displayLine ="";
    public final String helloWorld = "Hello, world!";
    public void turnOn(){
        System.out.println("Turning on...");
    }
    public void turnOff(){
        System.out.println("Turning off...");
    }

    public void printHelloWorld(){
        setDisplayLine(displayLine+helloWorld);
    }
    public String getDisplayLine() {
        return displayLine;
    }

    public void setDisplayLine(String displayLine) {
        this.displayLine = displayLine;
        System.out.println("Text on display: "+displayLine);
    }

}
