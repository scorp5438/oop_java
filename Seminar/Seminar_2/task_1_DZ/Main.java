package Seminar.Seminar_2.task_1_DZ;

import java.util.List;

// <aside>
// 📔 Описание приведено на слайде “задание 1” в виде uml диаграммы. Необходимо реализовать:

// 1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
// 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать
//заказ и факт получения заказа. Дополнение: для большего понимания у студентов, можно сделать
// методы-геттеры для имени и прочих “персональных данных” abstract
// 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
// </aside>

public class Main {
    public static void main(String[] args) {

        Market market = new Market();

        market.takeInQueue(new Human("Alex"));
        market.takeInQueue(new Human("Ivan"));
        market.takeInQueue(new Human("Lena", false));
        market.takeInQueue(new Human("Pety"));
        market.takeInQueue(new Human("Olya"));

        market.update();
    }
}
