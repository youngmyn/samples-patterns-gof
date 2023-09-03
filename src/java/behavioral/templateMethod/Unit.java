package behavioral.templateMethod;

public abstract class Unit {
    //Шаблонный метод собственной персоной
    public void attackFromARun(){
        move(Direction.FORWARD, 100);
        stop();
        attack();
        move(Direction.BACK, 50);
    }
    public abstract void attack();
    public abstract void move(Direction direction, int speed);
    public abstract void stop();

    public enum Direction {
        FORWARD,
        BACK,
        LEFT,
        RIGHT
    }
}
