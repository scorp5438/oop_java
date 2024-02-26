package Seminar.Seminar_2.task_1;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;

    public abstract String getName();

}