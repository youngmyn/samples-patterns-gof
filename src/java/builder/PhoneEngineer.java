package builder;

public class PhoneEngineer {
    private PhoneBuilder builder;

    public PhoneEngineer(PhoneBuilder builder) {
        super();
        this.builder = builder;
        if(this.builder == null){
            throw new IllegalArgumentException("Engineer can't work without the Builder");
        }
    }
    public Phone manufacturePhone(){
        return builder.fixMemory().fixDisplay().paintBrandLogo().build();
    }
}
