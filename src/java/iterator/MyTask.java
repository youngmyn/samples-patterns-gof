package iterator;

public class MyTask {
    private int priority;
    private String taskBody;

    public MyTask(String taskBody, int priority) {
        this.priority = priority;
        this.taskBody = taskBody;
    }

    public MyTask(String taskBody){
        this.taskBody = taskBody;
        priority = 5;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "priority=" + priority +
                ", taskBody='" + taskBody + '\'' +
                '}';
    }

    public int getPriority() {
        return priority;
    }

}
