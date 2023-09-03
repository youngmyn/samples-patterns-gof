package creational.builder.ConcreteBuliders;

import creational.builder.Phone;
import creational.builder.PhoneBuilder;

public class SUSungPhoneBuilder implements PhoneBuilder {
    private int memory;
    private double displayDiagonal;
    private String brand;

    public SUSungPhoneBuilder() {
        super();
    }

    @Override
    public PhoneBuilder fixMemory() {
        System.out.println("Assembling memory of the SUUUUUUUUUUUUUUUUUUUUUUU");
        this.memory = 100500;
        return this;
    }

    @Override
    public PhoneBuilder fixDisplay() {
        System.out.println("Assembling display of the SUUUUUUUUUUUUUUUUUUUUUUU");
        this.displayDiagonal = 228.228;
        return this;
    }

    @Override
    public PhoneBuilder paintBrandLogo() {
        System.out.println("Painting the SUUUUUUUUUUUUUUUUUUUUUUU");
        this.brand = "SUUUUUUUUU";
        return this;
    }

    @Override
    public Phone build() {
        Phone phone = new Phone(memory,displayDiagonal,brand);
        if(phone.checkQualityOfDevice()) return phone;
        else System.out.println("Troubles with Suuu////CALL RONALDO!!!!");
        return null;
    }
}
