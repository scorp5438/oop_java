package Seminar.Seminar_2.info;

public class Cat extends Animal implements Feeding {
    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("feeding with whiskas");
    }
}
