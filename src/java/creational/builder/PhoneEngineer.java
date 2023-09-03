package creational.builder;

public class PhoneEngineer {
    private PhoneBuilder builder;

    public PhoneEngineer(PhoneBuilder builder) {
        this.builder = builder;
        if(this.builder == null){
            throw new IllegalArgumentException("Engineer can't work without the Builder");
        }
    }
    //Вся магия видна именно в методе manufacturePhone
    public Phone manufacturePhone(){
        return builder.fixMemory().fixDisplay().paintBrandLogo().build();
    }
}
