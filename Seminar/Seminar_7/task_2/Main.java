package Seminar.Seminar_7.task_2;

/*
 * Задание: Создание системы заказа пиццы

Вам нужно разработать систему для заказа пиццы с использованием паттерна Factory.

Создайте интерфейс Pizza, который будет определять методы для приготовления и доставки пиццы.

Реализуйте несколько классов, представляющих различные виды пиццы (например, MargheritaPizza, PepperoniPizza, VegetarianPizza), реализующих интерфейс Pizza.

Создайте фабрику PizzaFactory, которая будет создавать объекты различных видов пиццы в зависимости от переданного типа.

Напишите клиентский код, который будет использовать фабрику для создания заказов различных видов пиццы и их доставки.
 */
public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaaFactory = new PizzaFactory();

        Pizza pizza = pizzaaFactory.createPizza("Vegetarian");

        System.out.println(pizza);
    }
}
