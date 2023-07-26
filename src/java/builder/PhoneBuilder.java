package builder;

public interface PhoneBuilder {
    //1 step
    public PhoneBuilder fixMemory();

    //2 step
    public PhoneBuilder fixDisplay();

    //3 step
    public PhoneBuilder paintBrandLogo();

    //Выпуск телефона
    public Phone build();
}
