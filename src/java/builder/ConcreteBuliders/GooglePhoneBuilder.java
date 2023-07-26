package builder.ConcreteBuliders;

import builder.Phone;
import builder.PhoneBuilder;

public class GooglePhoneBuilder implements PhoneBuilder {
    private int memory;
    private double displayDiagonal;
    private String brand;

    public GooglePhoneBuilder() {
        super();
    }

    @Override
    public PhoneBuilder fixMemory() {
        System.out.println("Assembling memory of the Google Pixel");
        this.memory = 64;
        return this;
    }

    @Override
    public PhoneBuilder fixDisplay() {
        System.out.println("Assembling display of the Google Pixel");
        this.displayDiagonal = 3.787878;
        return this;
    }

    @Override
    public PhoneBuilder paintBrandLogo() {
        System.out.println("Painting logo on the Google Pixel");
        this.brand = "GOOGLE PIXEL";
        return this;
    }

    @Override
    public Phone build() {
        Phone phone = new Phone(memory,displayDiagonal,brand);
        if(phone.checkQualityOfDevice()) return phone;
        else System.out.println("Sorry, but we have a problem with Google Pixel...");
        return null;
    }
}
