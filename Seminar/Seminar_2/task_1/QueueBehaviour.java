package Seminar.Seminar_2.task_1;

import java.util.List;

interface QueueBehaviour {
    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update(); // методы accept, release вызываются

}
