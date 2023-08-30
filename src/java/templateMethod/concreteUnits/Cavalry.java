package templateMethod.concreteUnits;

import templateMethod.Unit;

public class Cavalry extends Unit {
    @Override
    public void attack() {
        System.out.println("Бью копьем. Наношу 300 урона");
    }

    @Override
    public void move(Direction direction, int speed) {
        System.out.println("Скачу на лошади...");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаюсь прямо перед целью");
    }
}
