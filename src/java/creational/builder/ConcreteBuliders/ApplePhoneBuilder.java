package creational.builder.ConcreteBuliders;

import creational.builder.Phone;
import creational.builder.PhoneBuilder;

public class ApplePhoneBuilder implements PhoneBuilder {
    private int memory;
    private double displayDiagonal;
    private String brand;

    public ApplePhoneBuilder() {
        super();
    }

    @Override
    public PhoneBuilder fixMemory() {
        System.out.println("Assembling memory of the Apple Iphone");
        this.memory = 256;
        return this;
    }

    @Override
    public PhoneBuilder fixDisplay() {
        System.out.println("Assembling display of the Apple Iphone");
        this.displayDiagonal = 101.1;
        return this;
    }

    @Override
    public PhoneBuilder paintBrandLogo() {
        System.out.println("Painting logo on the Apple Iphone...");
        this.brand = "Apple";
        return this;
    }

    @Override
    public Phone build() {
        Phone phone = new Phone(memory,displayDiagonal,brand);
        if(phone.checkQualityOfDevice()) return phone;
        else System.out.println("Phone is crushed! Sorry...");
        return null;
    }
}
