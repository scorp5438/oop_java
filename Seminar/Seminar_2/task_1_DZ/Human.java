package Seminar.Seminar_2.task_1;

public class Human extends Actor {

    public Human(String name, boolean isMakeOrder, boolean isTakeOrder) {
        this.name = name;
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;
    }

    public Human(String name, boolean isMakeOrder) {
        this(name, isMakeOrder, true);
    }

    public Human(String name) {
        this(name, true, true);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String toString() {
        return String.format(name);
    }

}