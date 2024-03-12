package Seminar.Seminar_6.task_4;

/*
 * Здесь Engineer вынужден реализовывать метод eat(), хотя он ему не нужен.
 * ISP нарушается, так как интерфейс Worker должен быть разделен на более мелкие интерфейсы,
 * чтобы избежать "жирных" интерфейсов.
 */

interface Working {
    void work();

}

interface Eating {
    void eat();
}

class Engineer implements Working {

    @Override
    public void work() {
    }
}

class Worker implements Working, Eating {

    @Override
    public void eat() {
    }

    @Override
    public void work() {
    }
}
