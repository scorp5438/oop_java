package Seminar.Seminar_2.task_1_DZ;

interface MarketBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}
