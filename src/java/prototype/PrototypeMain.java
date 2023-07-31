package prototype;

import prototype.ConcreteUnits.Lancer;
import prototype.ConcreteUnits.Priest;
import prototype.staticGameObjects.Tree;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    /*
    Прототип – это порождающий паттерн проектирования, который позволяет копировать объекты,
    не вдаваясь в подробности их реализации.

    Паттерн Прототип поручает создание копий самим копируемым объектам.
    Он вводит общий интерфейс для всех объектов, поддерживающих клонирование.
    Это позволяет копировать объекты, не привязываясь к их конкретным классам.
    Обычно такой интерфейс имеет всего один метод clone(или copy).

    Реализация этого метода в разных классах очень схожа.
     Метод создаёт новый объект текущего класса и копирует в него значения всех полей собственного объекта.
     Так получится скопировать даже приватные поля, так как большинство языков программирования
     разрешает доступ к приватным полям любого объекта текущего класса.
     */
    public static void main(String[] args) {
    /*
    Не каждый объект удается скопировать "в лоб":
        (Person newPerson = new Person(oldPerson.getAge(), oldPerson.getName)), ведь часть его состояния
    может быть приватной, а значит – недоступной для остального кода программы.

    Есть и другая проблема. Копирующий код станет зависим от классов копируемых объектов.
    Ведь, чтобы перебрать все поля объекта, нужно привязаться к его классу.
    Из-за этого вы не сможете копировать объекты, зная только их интерфейсы, а не конкретные классы.

    В списке prototypes же хранятся готовые эталонные прототипы. Если в любом месте программы нам потребуется
    создать священника, лансера или даже дерево(разницы нет!), мы обратимся к списку прототипов
    и клонируем необходимый нам. Нам не нужно запоминать, какими значениями инициализируется здоровье
    священника, плюс, возможно в ходе игры эта цифра будет менятся, скажем он выпил супер-зелье(тогда мы
    скопируем рабочий прототип и сеттером увеличим ему здоровье).
    Не нужно задумываться, как это клонирование работает под капотом, наше дело пользоваться методом
    и получать полную и рабочую копию нужного нам обьекта. Этот вопрос особенно актуален, когда нам нужно
    создать очень много одинаковых обьектов, незначительно отличающихся друг от друга(например заспавнить 1000
    деревьев с одним единственным отличием: их координаты будут отличаться на 1 метр, скажем нам надо
    озеленить длинный проспект)

    */


        List<Prototype> prototypes = new ArrayList<>();
        prototypes.add(new Lancer(5));
        prototypes.add(new Priest(3,3));
        prototypes.add(new Tree());


        Lancer lancer = (Lancer) prototypes.get(0).copy();
        Priest priest = (Priest) prototypes.get(1).copy();

        printStatusOfBattlefield(lancer,priest);

        System.out.println("Battle:");
        lancer.attack(priest);
        priest.attack(lancer);

        printStatusOfBattlefield(lancer,priest);

        System.out.println("Spells and abilities:");
        priest.selfHeal();

        printStatusOfBattlefield(lancer,priest);

        System.out.println("Updating the battlefield...");
        lancer = (Lancer) prototypes.get(0).copy();
        priest = (Priest) prototypes.get(1).copy();

        printStatusOfBattlefield(lancer,priest);
    }
    static void printStatusOfBattlefield(Unit lancer, Unit priest){
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Status:");
        System.out.println(priest);
        System.out.println(lancer);
        System.out.println("-----------------------------------");
    }
}
