package Seminar.Seminar_2.task_1;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected Boolean isMakeOrder; // это сделать заказ
    protected Boolean isTakeOrder; // это получить заказ

    public abstract String getName();

    public abstract String setName();

}