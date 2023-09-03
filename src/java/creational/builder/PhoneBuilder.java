package creational.builder;

public interface PhoneBuilder {
    //1 step
    PhoneBuilder fixMemory();

    //2 step
    PhoneBuilder fixDisplay();

    //3 step
    PhoneBuilder paintBrandLogo();

    //Выпуск телефона
    Phone build();
}
