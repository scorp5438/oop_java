package Seminar.Seminar_2.task_1;

import java.util.List;

// <aside>
// 📔 приведен на слайде “задание 2” в виде uml диаграммы. Необходимо реализовать строение классов, без конкретной реализации:

// 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
// 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
// 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах
// </aside>

public class Market implements QueueBehaviour, MarketBehaviour {
    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void acceptToMarket(Actor actor) {

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {

    }
}
