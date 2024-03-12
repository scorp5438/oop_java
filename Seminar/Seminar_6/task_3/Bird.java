package Seminar.Seminar_6.task_3;

/*
 * В данном случае, нарушается LSP,
 * так как наследующий класс Ostrich изменяет ожидаемое поведение метода fly()
 * базового класса Bird.
 */

class Bird {
    String name;
}

interface Flying {
    public void fly();
    // Реализация полета птицы
}

interface Run {
    public void run();
    // Реализация бега птицы
}

class Ostrich extends Bird implements Run {

    @Override
    public void run() {
    }

}

class Eagle extends Bird implements Flying {

    @Override
    public void fly() {
    }
}
