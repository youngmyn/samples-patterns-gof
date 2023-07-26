package builder;

import builder.ConcreteBuliders.*;

public class BuilderMain {
    //Паттерн позволяет отделить построение сложного обьекта от его представления
    // Один из лучших способов создания сложных объектов
    //Состоит из:
    // 1)Product -класс, определящий сложный обьект
    // 2)Builder -абстрактный класс либо интерфейс, определяющий все этапы для производства Product
    // 3)ConcreteBuilder - класс строитель, предоставляющий фактический код для создания продукта(их может
    //  быть много)
    // 4) Director - класс, под контролем которого Строитель строит обект поэтапно(Обычно получает на вход
    //  Строителя) обычно класс директора присутствует,если важен порядок "сборки" продукта
    public static void main(String[] args) {
        PhoneBuilder builder = new GooglePhoneBuilder();//Реализацию интерфейса можно менять, попробуй!
        // (от этого и меняется модель телефона)↑↑↑
        PhoneEngineer engineer = new PhoneEngineer(builder);
        Phone phone = engineer.manufacturePhone();
        if(phone!=null){
            System.out.println("Phone delivered! It is: ");
            System.out.println(phone.toString());
        }
    }
}
