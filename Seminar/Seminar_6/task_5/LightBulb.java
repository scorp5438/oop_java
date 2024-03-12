package Seminar.Seminar_6.task_5;

/*
 * Здесь класс Switch жестко зависит от класса LightBulb,
 * нарушая DIP. Чтобы следовать DIP, зависимость должна быть инвертирована с использованием интерфейсов или абстракций.

Эти примеры демонстрируют нарушение каждого из принципов SOLID на языке Java.
Чтобы улучшить код, следует рассмотреть возможности его рефакторинга, чтобы соответствовать этим принципам.
 */

// class LightBulb implements Switchabl {
//     public void turnOn() {
//         // Включение лампочки
//     }

//     public void turnOff() {
//         // Выключение лампочки
//     }
// }

// interface Switchabl {
//     public void turnOn();

//     public void turnOff();
// }

// class Switch {
//     private Switchabl bulb;

//     public Switch(Switchabl device) {
//         this.bulb = device;
//     }

//     public void operate() {
//         // Работа с выключателем
//         bulb.turnOn();
//     }
// }

abstract class Bulb {
    protected int power;

    public void turnOn() {
        // Включение лампочки
    }

    public void turnOff() {
        // Выключение лампочки
    }
}

class LightBulb extends Bulb {
    String type;
    private int state = 1;

    public LightBulb(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public int getState() {
        return state;
    }
}

class Switch {
    // private Bulb device = new LightBulb(100, "led");
    private Bulb device;

    public Switch(LightBulb device) {
        this.device = device;
    }

    public void operate() {
        // Работа с выключателем
        device.turnOn();
    }
}