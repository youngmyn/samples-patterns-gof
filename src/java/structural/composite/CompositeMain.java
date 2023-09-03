package structural.composite;

import structural.composite.TreeComponents.Apartment;
import structural.composite.TreeComponents.Floor;
import structural.composite.TreeComponents.House;
import structural.composite.TreeComponents.Room;

/*  https://radioprog.ru/post/1480
    Компоновщик(Composite) – это структурный паттерн проектирования, который позволяет сгруппировать множество объектов
    в древовидную структуру, а затем работать с ней так, как будто это единый объект.

    Паттерн Компоновщик имеет смысл только тогда, когда основная модель вашей программы может быть
    структурирована в виде дерева.
    Например, есть два объекта: Продукт и Коробка.
    Коробка может содержать несколько Продуктов и других Коробок поменьше.
    Те, в свою очередь, тоже содержат либо Продукты, либо Коробки, и так далее.

    Теперь предположим, ваши Продукты и Коробки могут быть частью заказов.
    Каждый заказ может содержать как простые Продукты без упаковки, так и составные Коробки.
    Ваша задача состоит в том, чтобы узнать цену всего заказа.

    Если решать задачу в лоб, то вам потребуется открыть все коробки заказа,
    перебрать все продукты и посчитать их суммарную стоимость.
    Но это слишком хлопотно, так как типы коробок и их содержимое могут быть вам неизвестны.
    Кроме того, наперёд неизвестно и количество уровней вложенности коробок,
     поэтому перебрать коробки простым циклом не выйдет.

    Компоновщик предлагает рассматривать Продукт и Коробку через единый интерфейс
    с общим методом получения стоимости.
    Продукт просто вернёт свою цену.
    Коробка же спросит цену каждого предмета внутри себя и вернёт сумму результатов.
    Если одним из внутренних предметов окажется коробка поменьше, она тоже будет перебирать своё содержимое,
     и так далее, пока не будут посчитаны все составные части.

    Для вас, клиента, главное, что теперь не нужно ничего знать о структуре заказов.
    Вы вызываете метод получения цены, он возвращает цифру, а вы не тонете в горах картона и скотча.


    Преимущества
        Упрощает архитектуру клиента при работе со сложным деревом компонентов.
        Облегчает добавление новых видов компонентов.
    Недостатки
        Создаёт слишком общий дизайн классов.
*/
public class CompositeMain {
    public static void main(String[] args) {
        Room bathroom = new Room("bathroom");
        Room kitchen = new Room("kitchen");
        Room hall = new Room("hall");
        Room playroom = new Room("playroom");
        Room guestRoom = new Room("guest room");

        Apartment apart1 = new Apartment(1);
        apart1.add(hall);
        apart1.add(kitchen);
        apart1.add(bathroom);

        Apartment apart2 = new Apartment(2);
        apart2.add(hall);
        apart2.add(playroom);
        apart2.add(kitchen);
        apart2.add(bathroom);

        Apartment apart3 = new Apartment(3);
        apart3.add(hall);
        apart3.add(kitchen);
        apart3.add(bathroom);

        Apartment apart4 = new Apartment(4);
        apart4.add(hall);
        apart4.add(playroom);
        apart4.add(guestRoom);
        apart4.add(kitchen);
        apart4.add(bathroom);

        Floor floor1 = new Floor(1);
        floor1.add(apart1);
        floor1.add(apart2);

        Floor floor2 = new Floor(2);
        floor2.add(apart3);
        floor2.add(apart4);

        House house = new House("Residential complex \"Zvezda\"");
        house.add(floor1);
        house.add(floor2);

        house.print();
    }
}

