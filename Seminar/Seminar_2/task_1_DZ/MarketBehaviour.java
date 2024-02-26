package Seminar.Seminar_2.task_1;

interface MarketBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}
