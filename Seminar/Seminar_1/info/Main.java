package Seminar.Seminar_1.info;

public class Main {
    static Cat cat = new Cat();

    public static void main(String[] args) {
        cat.setName("boris");
        cat.setAge(5);
        System.out.println(cat);
        badMethod();
        RussianGreyCat russianGreyCat = new RussianGreyCat();
        russianGreyCat.voice();
        Animal.sayHello();

    }

    public static void badMethod() {
        cat.setName("murzik");

        System.out.println(cat);

    }
}
