package templateMethod.concreteUnits;

import templateMethod.Unit;

public class Archer extends Unit {
    @Override
    public void attack() {
        System.out.println("Стреляю из лука. Наношу 100 урона");
    }

    @Override
    public void move(Direction direction, int speed) {
        System.out.println("Бегу...");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаюсь в 200 метрах от цели");
    }
}
