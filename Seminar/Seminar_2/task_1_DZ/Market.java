package Seminar.Seminar_2.task_1;

import java.util.LinkedList;
import java.util.List;

// <aside>
// 📔 приведен на слайде “задание 2” в виде uml диаграммы. Необходимо реализовать строение классов, без конкретной реализации:

// 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
// 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
// 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах
// </aside>

// ДЗ:
// Реализовать класс Market и все методы, которые он обязан реализовывать.
// Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)

// Формат сдачи: ссылка на гитхаб проект

public class Market implements QueueBehaviour, MarketBehaviour {
    public List<Actor> actors = new LinkedList<>();

    @Override
    public void takeInQueue(Actor actor) { // занять очередь
        actors.addLast(actor);
    }

    @Override
    public void takeOrders() { // принимать заказы
        System.out.printf("%s Ваш заказ принят, ожидайте\n", actors.get(0));
        giveOrders();
    }

    @Override
    public void giveOrders() { // отдавать приказы
        System.out.printf("%s Получите ваш заказ\n", actors.get(0));
        releaseFromQueue();
    }

    @Override
    public void releaseFromQueue() { // выпустить из очереди
        System.out.printf("%s До свидания\n", actors.get(0));
    }

    @Override
    public void acceptToMarket(Actor actor) { // принять на рынок
        if (actor.isMakeOrder() && actor.isTakeOrder()) {
            takeOrders();
        } else {
            System.out.printf("%s вашего заказа нет\n", actors.get(0));
        }
        // update();

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) { // освобождение от рынка
        actors.removeFirst();
        update();
    }

    @Override
    public void update() { // обновление
        if (!actors.isEmpty()) {
            acceptToMarket(actors.get(0));
            releaseFromMarket(actors);
        } else {
            System.out.printf("Очередь пуста...");
        }
    }

}